package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
abstract class BufferBaseDigest implements ExtendedDigest {
    protected int BlockSize;
    protected int DigestSize;
    protected String algorithmName;
    protected byte[] m_buf;
    protected int m_bufPos;
    protected ProcessingBuffer processor;

    private class BufferedProcessor implements ProcessingBuffer {
        private BufferedProcessor() {
        }

        @Override // org.bouncycastle.crypto.digests.BufferBaseDigest.ProcessingBuffer
        public boolean isLengthExceedingBlockSize(int i15, int i16) {
            return i15 > i16;
        }

        @Override // org.bouncycastle.crypto.digests.BufferBaseDigest.ProcessingBuffer
        public boolean isLengthWithinAvailableSpace(int i15, int i16) {
            return i15 <= i16;
        }

        @Override // org.bouncycastle.crypto.digests.BufferBaseDigest.ProcessingBuffer
        public void update(byte b15) {
            BufferBaseDigest bufferBaseDigest = BufferBaseDigest.this;
            if (bufferBaseDigest.m_bufPos == bufferBaseDigest.BlockSize) {
                bufferBaseDigest.processBytes(bufferBaseDigest.m_buf, 0);
                BufferBaseDigest.this.m_bufPos = 0;
            }
            BufferBaseDigest bufferBaseDigest2 = BufferBaseDigest.this;
            byte[] bArr = bufferBaseDigest2.m_buf;
            int i15 = bufferBaseDigest2.m_bufPos;
            bufferBaseDigest2.m_bufPos = i15 + 1;
            bArr[i15] = b15;
        }
    }

    private class ImmediateProcessor implements ProcessingBuffer {
        private ImmediateProcessor() {
        }

        @Override // org.bouncycastle.crypto.digests.BufferBaseDigest.ProcessingBuffer
        public boolean isLengthExceedingBlockSize(int i15, int i16) {
            return i15 >= i16;
        }

        @Override // org.bouncycastle.crypto.digests.BufferBaseDigest.ProcessingBuffer
        public boolean isLengthWithinAvailableSpace(int i15, int i16) {
            return i15 < i16;
        }

        @Override // org.bouncycastle.crypto.digests.BufferBaseDigest.ProcessingBuffer
        public void update(byte b15) {
            BufferBaseDigest bufferBaseDigest = BufferBaseDigest.this;
            byte[] bArr = bufferBaseDigest.m_buf;
            int i15 = bufferBaseDigest.m_bufPos;
            bArr[i15] = b15;
            int i16 = i15 + 1;
            bufferBaseDigest.m_bufPos = i16;
            if (i16 == bufferBaseDigest.BlockSize) {
                bufferBaseDigest.processBytes(bArr, 0);
                BufferBaseDigest.this.m_bufPos = 0;
            }
        }
    }

    protected interface ProcessingBuffer {
        boolean isLengthExceedingBlockSize(int i15, int i16);

        boolean isLengthWithinAvailableSpace(int i15, int i16);

        void update(byte b15);
    }

    protected static class ProcessingBufferType {
        public static final int BUFFERED = 0;
        public static final int IMMEDIATE = 1;
        private final int ord;
        public static final ProcessingBufferType Buffered = new ProcessingBufferType(0);
        public static final ProcessingBufferType Immediate = new ProcessingBufferType(1);

        ProcessingBufferType(int i15) {
            this.ord = i15;
        }
    }

    protected BufferBaseDigest(ProcessingBufferType processingBufferType, int i15) {
        ProcessingBuffer bufferedProcessor;
        this.BlockSize = i15;
        this.m_buf = new byte[i15];
        int i16 = processingBufferType.ord;
        if (i16 == 0) {
            bufferedProcessor = new BufferedProcessor();
        } else if (i16 != 1) {
            return;
        } else {
            bufferedProcessor = new ImmediateProcessor();
        }
        this.processor = bufferedProcessor;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i15) {
        ensureSufficientOutputBuffer(bArr, i15);
        finish(bArr, i15);
        reset();
        return this.DigestSize;
    }

    protected void ensureSufficientInputBuffer(byte[] bArr, int i15, int i16) {
        if (i15 + i16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
    }

    protected void ensureSufficientOutputBuffer(byte[] bArr, int i15) {
        if (this.DigestSize + i15 > bArr.length) {
            throw new OutputLengthException("output buffer is too short");
        }
    }

    protected abstract void finish(byte[] bArr, int i15);

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.BlockSize;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.DigestSize;
    }

    protected abstract void processBytes(byte[] bArr, int i15);

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        Arrays.clear(this.m_buf);
        this.m_bufPos = 0;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b15) {
        this.processor.update(b15);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i15, int i16) {
        ensureSufficientInputBuffer(bArr, i15, i16);
        int i17 = this.BlockSize - this.m_bufPos;
        if (this.processor.isLengthWithinAvailableSpace(i16, i17)) {
            System.arraycopy(bArr, i15, this.m_buf, this.m_bufPos, i16);
            this.m_bufPos += i16;
            return;
        }
        int i18 = this.m_bufPos;
        if (i18 > 0) {
            System.arraycopy(bArr, i15, this.m_buf, i18, i17);
            i15 += i17;
            i16 -= i17;
            processBytes(this.m_buf, 0);
        }
        while (this.processor.isLengthExceedingBlockSize(i16, this.BlockSize)) {
            processBytes(bArr, i15);
            int i19 = this.BlockSize;
            i15 += i19;
            i16 -= i19;
        }
        System.arraycopy(bArr, i15, this.m_buf, 0, i16);
        this.m_bufPos = i16;
    }
}
