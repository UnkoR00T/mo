package org.bouncycastle.crypto.engines;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.modes.AEADCipher;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
abstract class AEADBaseEngine implements AEADCipher {
    protected int AADBufferSize;
    protected int BlockSize;
    protected int IV_SIZE;
    protected int KEY_SIZE;
    protected int MAC_SIZE;
    protected AADOperator aadOperator;
    protected String algorithmName;
    protected DataOperator dataOperator;
    protected boolean forEncryption;
    protected byte[] initialAssociatedText;
    protected byte[] m_aad;
    protected int m_aadPos;
    protected byte[] m_buf;
    protected int m_bufPos;
    protected int m_bufferSizeDecrypt;
    protected byte[] mac;
    protected AADProcessingBuffer processor;
    protected int macSizeLowerBound = 0;
    protected State m_state = State.Uninitialized;
    protected DecryptionFailureCounter decryptionFailureCounter = null;
    protected DataLimitCounter dataLimitCounter = null;

    protected interface AADOperator {
        int getLen();

        void processAADByte(byte b15);

        void processAADBytes(byte[] bArr, int i15, int i16);

        void reset();
    }

    protected static class AADOperatorType {
        public static final int COUNTER = 1;
        public static final int DATA_LIMIT = 3;
        public static final int DEFAULT = 0;
        public static final int STREAM = 2;
        private final int ord;
        public static final AADOperatorType Default = new AADOperatorType(0);
        public static final AADOperatorType Counter = new AADOperatorType(1);
        public static final AADOperatorType Stream = new AADOperatorType(2);
        public static final AADOperatorType DataLimit = new AADOperatorType(3);

        AADOperatorType(int i15) {
            this.ord = i15;
        }
    }

    private interface AADProcessingBuffer {
        int getUpdateOutputSize(int i15);

        boolean isLengthExceedingBlockSize(int i15, int i16);

        boolean isLengthWithinAvailableSpace(int i15, int i16);

        void processAADByte(byte b15);

        int processByte(byte b15, byte[] bArr, int i15);
    }

    private class BufferedAADProcessor implements AADProcessingBuffer {
        private BufferedAADProcessor() {
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public int getUpdateOutputSize(int i15) {
            return Math.max(0, i15) - 1;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public boolean isLengthExceedingBlockSize(int i15, int i16) {
            return i15 > i16;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public boolean isLengthWithinAvailableSpace(int i15, int i16) {
            return i15 <= i16;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public void processAADByte(byte b15) {
            AEADBaseEngine aEADBaseEngine = AEADBaseEngine.this;
            if (aEADBaseEngine.m_aadPos == aEADBaseEngine.AADBufferSize) {
                aEADBaseEngine.processBufferAAD(aEADBaseEngine.m_aad, 0);
                AEADBaseEngine.this.m_aadPos = 0;
            }
            AEADBaseEngine aEADBaseEngine2 = AEADBaseEngine.this;
            byte[] bArr = aEADBaseEngine2.m_aad;
            int i15 = aEADBaseEngine2.m_aadPos;
            aEADBaseEngine2.m_aadPos = i15 + 1;
            bArr[i15] = b15;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public int processByte(byte b15, byte[] bArr, int i15) {
            AEADBaseEngine.this.checkData(false);
            int iProcessEncDecByte = AEADBaseEngine.this.processEncDecByte(bArr, i15);
            AEADBaseEngine aEADBaseEngine = AEADBaseEngine.this;
            byte[] bArr2 = aEADBaseEngine.m_buf;
            int i16 = aEADBaseEngine.m_bufPos;
            aEADBaseEngine.m_bufPos = i16 + 1;
            bArr2[i16] = b15;
            return iProcessEncDecByte;
        }
    }

    private class CounterAADOperator implements AADOperator {
        private int aadLen;

        private CounterAADOperator() {
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public int getLen() {
            return this.aadLen;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void processAADByte(byte b15) {
            this.aadLen++;
            AEADBaseEngine.this.processor.processAADByte(b15);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void processAADBytes(byte[] bArr, int i15, int i16) {
            this.aadLen += i16;
            AEADBaseEngine.this.processAadBytes(bArr, i15, i16);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void reset() {
            this.aadLen = 0;
        }
    }

    private class CounterDataOperator implements DataOperator {
        private int messegeLen;

        private CounterDataOperator() {
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int getLen() {
            return this.messegeLen;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int processByte(byte b15, byte[] bArr, int i15) {
            this.messegeLen++;
            return AEADBaseEngine.this.processor.processByte(b15, bArr, i15);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int processBytes(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) {
            this.messegeLen += i16;
            return AEADBaseEngine.this.processEncDecBytes(bArr, i15, i16, bArr2, i17);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public void reset() {
            this.messegeLen = 0;
        }
    }

    private class DataLimitAADOperator implements AADOperator {
        private DataLimitAADOperator() {
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public int getLen() {
            return AEADBaseEngine.this.m_aadPos;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void processAADByte(byte b15) {
            AEADBaseEngine.this.dataLimitCounter.increment();
            AEADBaseEngine.this.processor.processAADByte(b15);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void processAADBytes(byte[] bArr, int i15, int i16) {
            AEADBaseEngine.this.dataLimitCounter.increment(i16);
            AEADBaseEngine.this.processAadBytes(bArr, i15, i16);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void reset() {
        }
    }

    protected static class DataLimitCounter {
        private long count;
        private long max;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f148996n;

        protected DataLimitCounter() {
        }

        public void increment() {
            long j15 = this.count + 1;
            this.count = j15;
            if (j15 <= this.max) {
                return;
            }
            throw new IllegalStateException("Total data limit exceeded: maximum 2^" + this.f148996n + " bytes per key (including nonce, AAD, and message)");
        }

        public void init(int i15) {
            this.f148996n = i15;
            this.max = 1 << i15;
        }

        public void reset() {
            this.count = 0L;
        }

        public void increment(int i15) {
            long j15 = this.count + ((long) i15);
            this.count = j15;
            if (j15 <= this.max) {
                return;
            }
            throw new IllegalStateException("Total data limit exceeded: maximum 2^" + i15 + " bytes per key (including nonce, AAD, and message)");
        }
    }

    private class DataLimitDataOperator implements DataOperator {
        private DataLimitDataOperator() {
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int getLen() {
            return AEADBaseEngine.this.m_bufPos;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int processByte(byte b15, byte[] bArr, int i15) {
            AEADBaseEngine.this.dataLimitCounter.increment();
            return AEADBaseEngine.this.processor.processByte(b15, bArr, i15);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int processBytes(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) {
            AEADBaseEngine.this.dataLimitCounter.increment(i16);
            return AEADBaseEngine.this.processEncDecBytes(bArr, i15, i16, bArr2, i17);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public void reset() {
        }
    }

    protected interface DataOperator {
        int getLen();

        int processByte(byte b15, byte[] bArr, int i15);

        int processBytes(byte[] bArr, int i15, int i16, byte[] bArr2, int i17);

        void reset();
    }

    protected static class DataOperatorType {
        public static final int COUNTER = 1;
        public static final int DATA_LIMIT = 4;
        public static final int DEFAULT = 0;
        public static final int STREAM = 2;
        public static final int STREAM_CIPHER = 3;
        private final int ord;
        public static final DataOperatorType Default = new DataOperatorType(0);
        public static final DataOperatorType Counter = new DataOperatorType(1);
        public static final DataOperatorType Stream = new DataOperatorType(2);
        public static final DataOperatorType StreamCipher = new DataOperatorType(3);
        public static final DataOperatorType DataLimit = new DataOperatorType(4);

        DataOperatorType(int i15) {
            this.ord = i15;
        }
    }

    protected static class DecryptionFailureCounter {
        private int[] counter;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f148997n;

        protected DecryptionFailureCounter() {
        }

        public boolean increment() {
            int i15;
            int length = this.counter.length;
            do {
                length--;
                if (length < 0) {
                    break;
                }
                int[] iArr = this.counter;
                i15 = iArr[length] + 1;
                iArr[length] = i15;
            } while (i15 == 0);
            int i16 = this.f148997n & 31;
            if (length <= 0) {
                if (this.counter[0] == (i16 == 0 ? 0 : 1 << i16)) {
                    return true;
                }
            }
            return false;
        }

        public void init(int i15) {
            if (this.f148997n != i15) {
                this.f148997n = i15;
                int i16 = (i15 + 31) >>> 5;
                int[] iArr = this.counter;
                if (iArr == null || i16 != iArr.length) {
                    this.counter = new int[i16];
                } else {
                    reset();
                }
            }
        }

        public void reset() {
            Arrays.fill(this.counter, 0);
        }
    }

    private class DefaultAADOperator implements AADOperator {
        private DefaultAADOperator() {
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public int getLen() {
            return AEADBaseEngine.this.m_aadPos;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void processAADByte(byte b15) {
            AEADBaseEngine.this.processor.processAADByte(b15);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void processAADBytes(byte[] bArr, int i15, int i16) {
            AEADBaseEngine.this.processAadBytes(bArr, i15, i16);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void reset() {
        }
    }

    private class DefaultDataOperator implements DataOperator {
        private DefaultDataOperator() {
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int getLen() {
            return AEADBaseEngine.this.m_bufPos;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int processByte(byte b15, byte[] bArr, int i15) {
            return AEADBaseEngine.this.processor.processByte(b15, bArr, i15);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int processBytes(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) {
            return AEADBaseEngine.this.processEncDecBytes(bArr, i15, i16, bArr2, i17);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public void reset() {
        }
    }

    protected static final class ErasableOutputStream extends ByteArrayOutputStream {
        public byte[] getBuf() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    private class ImmediateAADProcessor implements AADProcessingBuffer {
        private ImmediateAADProcessor() {
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public int getUpdateOutputSize(int i15) {
            return Math.max(0, i15);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public boolean isLengthExceedingBlockSize(int i15, int i16) {
            return i15 >= i16;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public boolean isLengthWithinAvailableSpace(int i15, int i16) {
            return i15 < i16;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public void processAADByte(byte b15) {
            AEADBaseEngine aEADBaseEngine = AEADBaseEngine.this;
            byte[] bArr = aEADBaseEngine.m_aad;
            int i15 = aEADBaseEngine.m_aadPos;
            int i16 = i15 + 1;
            aEADBaseEngine.m_aadPos = i16;
            bArr[i15] = b15;
            if (i16 == aEADBaseEngine.AADBufferSize) {
                aEADBaseEngine.processBufferAAD(bArr, 0);
                AEADBaseEngine.this.m_aadPos = 0;
            }
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADProcessingBuffer
        public int processByte(byte b15, byte[] bArr, int i15) {
            AEADBaseEngine.this.checkData(false);
            AEADBaseEngine aEADBaseEngine = AEADBaseEngine.this;
            byte[] bArr2 = aEADBaseEngine.m_buf;
            int i16 = aEADBaseEngine.m_bufPos;
            aEADBaseEngine.m_bufPos = i16 + 1;
            bArr2[i16] = b15;
            return aEADBaseEngine.processEncDecByte(bArr, i15);
        }
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

    protected static class State {
        public static final int DEC_AAD = 6;
        public static final int DEC_DATA = 7;
        public static final int DEC_FINAL = 8;
        public static final int DEC_INIT = 5;
        public static final int ENC_AAD = 2;
        public static final int ENC_DATA = 3;
        public static final int ENC_FINAL = 4;
        public static final int ENC_INIT = 1;
        public static final int UNINITIALIZED = 0;
        final int ord;
        public static final State Uninitialized = new State(0);
        public static final State EncInit = new State(1);
        public static final State EncAad = new State(2);
        public static final State EncData = new State(3);
        public static final State EncFinal = new State(4);
        public static final State DecInit = new State(5);
        public static final State DecAad = new State(6);
        public static final State DecData = new State(7);
        public static final State DecFinal = new State(8);

        State(int i15) {
            this.ord = i15;
        }
    }

    protected static class StreamAADOperator implements AADOperator {
        private final ErasableOutputStream stream = new ErasableOutputStream();

        protected StreamAADOperator() {
        }

        public byte[] getBytes() {
            return this.stream.getBuf();
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public int getLen() {
            return this.stream.size();
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void processAADByte(byte b15) throws IOException {
            this.stream.write(b15);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void processAADBytes(byte[] bArr, int i15, int i16) throws IOException {
            this.stream.write(bArr, i15, i16);
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperator
        public void reset() {
            this.stream.reset();
        }
    }

    private class StreamCipherOperator implements DataOperator {
        private int len;

        private StreamCipherOperator() {
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int getLen() {
            return this.len;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int processByte(byte b15, byte[] bArr, int i15) {
            if (AEADBaseEngine.this.checkData(false)) {
                this.len = 1;
                AEADBaseEngine.this.processBufferEncrypt(new byte[]{b15}, 0, bArr, i15);
                return 1;
            }
            AEADBaseEngine aEADBaseEngine = AEADBaseEngine.this;
            int i16 = aEADBaseEngine.m_bufPos;
            if (i16 != aEADBaseEngine.MAC_SIZE) {
                byte[] bArr2 = aEADBaseEngine.m_buf;
                aEADBaseEngine.m_bufPos = i16 + 1;
                bArr2[i16] = b15;
                return 0;
            }
            this.len = 1;
            aEADBaseEngine.processBufferDecrypt(aEADBaseEngine.m_buf, 0, bArr, i15);
            AEADBaseEngine aEADBaseEngine2 = AEADBaseEngine.this;
            byte[] bArr3 = aEADBaseEngine2.m_buf;
            System.arraycopy(bArr3, 1, bArr3, 0, aEADBaseEngine2.m_bufPos - 1);
            AEADBaseEngine aEADBaseEngine3 = AEADBaseEngine.this;
            aEADBaseEngine3.m_buf[aEADBaseEngine3.m_bufPos - 1] = b15;
            return 1;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int processBytes(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) {
            int i18 = 0;
            if (bArr == bArr2 && Arrays.segmentsOverlap(i15, i16, i17, AEADBaseEngine.this.processor.getUpdateOutputSize(i16))) {
                bArr = new byte[i16];
                System.arraycopy(bArr2, i15, bArr, 0, i16);
                i15 = 0;
            }
            if (AEADBaseEngine.this.checkData(false)) {
                this.len = i16;
                AEADBaseEngine.this.processBufferEncrypt(bArr, i15, bArr2, i17);
                return i16;
            }
            AEADBaseEngine aEADBaseEngine = AEADBaseEngine.this;
            int iMax = Math.max((aEADBaseEngine.m_bufPos + i16) - aEADBaseEngine.MAC_SIZE, 0);
            int i19 = AEADBaseEngine.this.m_bufPos;
            if (i19 > 0) {
                int iMin = Math.min(iMax, i19);
                this.len = iMin;
                AEADBaseEngine aEADBaseEngine2 = AEADBaseEngine.this;
                aEADBaseEngine2.processBufferDecrypt(aEADBaseEngine2.m_buf, 0, bArr2, i17);
                iMax -= iMin;
                AEADBaseEngine aEADBaseEngine3 = AEADBaseEngine.this;
                int i25 = aEADBaseEngine3.m_bufPos - iMin;
                aEADBaseEngine3.m_bufPos = i25;
                byte[] bArr3 = aEADBaseEngine3.m_buf;
                System.arraycopy(bArr3, iMin, bArr3, 0, i25);
                i18 = iMin;
            }
            if (iMax > 0) {
                this.len = iMax;
                AEADBaseEngine.this.processBufferDecrypt(bArr, i15, bArr2, i17);
                i18 += iMax;
                i16 -= iMax;
                i15 += iMax;
            }
            AEADBaseEngine aEADBaseEngine4 = AEADBaseEngine.this;
            System.arraycopy(bArr, i15, aEADBaseEngine4.m_buf, aEADBaseEngine4.m_bufPos, i16);
            AEADBaseEngine.this.m_bufPos += i16;
            return i18;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public void reset() {
        }
    }

    protected class StreamDataOperator implements DataOperator {
        private final ErasableOutputStream stream = new ErasableOutputStream();

        protected StreamDataOperator() {
        }

        public byte[] getBytes() {
            return this.stream.getBuf();
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int getLen() {
            return this.stream.size();
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int processByte(byte b15, byte[] bArr, int i15) throws IOException {
            AEADBaseEngine.this.checkData(false);
            AEADBaseEngine.this.ensureInitialized();
            this.stream.write(b15);
            AEADBaseEngine.this.m_bufPos = this.stream.size();
            return 0;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public int processBytes(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) throws IOException {
            AEADBaseEngine.this.checkData(false);
            AEADBaseEngine.this.ensureInitialized();
            this.stream.write(bArr, i15, i16);
            AEADBaseEngine.this.m_bufPos = this.stream.size();
            return 0;
        }

        @Override // org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperator
        public void reset() {
            this.stream.reset();
        }
    }

    AEADBaseEngine() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processAadBytes(byte[] bArr, int i15, int i16) {
        int i17 = this.m_aadPos;
        if (i17 > 0) {
            int i18 = this.AADBufferSize - i17;
            if (this.processor.isLengthWithinAvailableSpace(i16, i18)) {
                System.arraycopy(bArr, i15, this.m_aad, this.m_aadPos, i16);
                this.m_aadPos += i16;
                return;
            } else {
                System.arraycopy(bArr, i15, this.m_aad, this.m_aadPos, i18);
                i15 += i18;
                i16 -= i18;
                processBufferAAD(this.m_aad, 0);
            }
        }
        while (this.processor.isLengthExceedingBlockSize(i16, this.AADBufferSize)) {
            processBufferAAD(bArr, i15);
            int i19 = this.AADBufferSize;
            i15 += i19;
            i16 -= i19;
        }
        System.arraycopy(bArr, i15, this.m_aad, 0, i16);
        this.m_aadPos = i16;
    }

    protected void checkAAD() {
        State state;
        int i15 = this.m_state.ord;
        if (i15 == 1) {
            state = State.EncAad;
        } else {
            if (i15 == 2) {
                return;
            }
            if (i15 == 4) {
                throw new IllegalStateException(getAlgorithmName() + " cannot be reused for encryption");
            }
            if (i15 != 5) {
                if (i15 == 6) {
                    return;
                }
                throw new IllegalStateException(getAlgorithmName() + " needs to be initialized");
            }
            state = State.DecAad;
        }
        this.m_state = state;
    }

    protected boolean checkData(boolean z15) {
        switch (this.m_state.ord) {
            case 1:
            case 2:
                finishAAD(State.EncData, z15);
                return true;
            case 3:
                return true;
            case 4:
                throw new IllegalStateException(getAlgorithmName() + " cannot be reused for encryption");
            case 5:
            case 6:
                finishAAD(State.DecData, z15);
                return false;
            case 7:
                return false;
            default:
                throw new IllegalStateException(getAlgorithmName() + " needs to be initialized");
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i15) throws InvalidCipherTextException {
        int i16;
        boolean zCheckData = checkData(true);
        int i17 = this.m_bufPos;
        int i18 = this.MAC_SIZE;
        if (zCheckData) {
            i16 = i17 + i18;
        } else {
            if (i17 < i18) {
                throw new InvalidCipherTextException("data too short");
            }
            i16 = i17 - i18;
            this.m_bufPos = i16;
        }
        ensureSufficientOutputBuffer(bArr, i15, i16);
        this.mac = new byte[this.MAC_SIZE];
        processFinalBlock(bArr, i15);
        if (zCheckData) {
            byte[] bArr2 = this.mac;
            int i19 = this.MAC_SIZE;
            System.arraycopy(bArr2, 0, bArr, (i15 + i16) - i19, i19);
        } else if (!Arrays.constantTimeAreEqual(this.MAC_SIZE, this.mac, 0, this.m_buf, this.m_bufPos)) {
            DecryptionFailureCounter decryptionFailureCounter = this.decryptionFailureCounter;
            if (decryptionFailureCounter == null || !decryptionFailureCounter.increment()) {
                throw new InvalidCipherTextException(this.algorithmName + " mac does not match");
            }
            throw new InvalidCipherTextException(this.algorithmName + " decryption failure limit exceeded");
        }
        reset(!zCheckData);
        return i16;
    }

    protected final void ensureInitialized() {
        if (this.m_state == State.Uninitialized) {
            throw new IllegalStateException("Need to call init function before operation");
        }
    }

    protected final void ensureSufficientInputBuffer(byte[] bArr, int i15, int i16) {
        if (i15 + i16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
    }

    protected final void ensureSufficientOutputBuffer(byte[] bArr, int i15, int i16) {
        if (i15 + i16 > bArr.length) {
            throw new OutputLengthException("output buffer too short");
        }
    }

    protected abstract void finishAAD(State state, boolean z15);

    protected void finishAAD1(State state) {
        int i15 = this.m_state.ord;
        if (i15 == 1 || i15 == 2 || i15 == 5 || i15 == 6) {
            processFinalAAD();
        }
        this.m_state = state;
    }

    protected void finishAAD2(State state) {
        int i15 = this.m_state.ord;
        if (i15 == 2 || i15 == 6) {
            processFinalAAD();
        }
        this.m_aadPos = 0;
        this.m_state = state;
    }

    protected void finishAAD3(State state, boolean z15) {
        int i15 = this.m_state.ord;
        if (i15 == 1 || i15 == 2) {
            processFinalAAD();
        } else if (i15 == 5 || i15 == 6) {
            if (!z15 && this.dataOperator.getLen() <= this.MAC_SIZE) {
                return;
            }
            processFinalAAD();
        }
        this.m_aadPos = 0;
        this.m_state = state;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    public final int getBlockSize() {
        return this.BlockSize;
    }

    public int getIVBytesSize() {
        return this.IV_SIZE;
    }

    public int getKeyBytesSize() {
        return this.KEY_SIZE;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return this.mac;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i15) {
        int iMax = Math.max(0, i15);
        switch (this.m_state.ord) {
            case 3:
            case 4:
                return iMax + this.m_bufPos + this.MAC_SIZE;
            case 5:
            case 6:
            case 7:
            case 8:
                return Math.max(0, (iMax + this.m_bufPos) - this.MAC_SIZE);
            default:
                return iMax + this.MAC_SIZE;
        }
    }

    protected int getTotalBytesForUpdate(int i15) {
        int i16;
        int updateOutputSize = this.processor.getUpdateOutputSize(i15);
        switch (this.m_state.ord) {
            case 3:
            case 4:
                i16 = updateOutputSize + this.m_bufPos;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                i16 = (updateOutputSize + this.m_bufPos) - this.MAC_SIZE;
                break;
            default:
                return updateOutputSize;
        }
        return Math.max(0, i16);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i15) {
        int totalBytesForUpdate = getTotalBytesForUpdate(i15);
        return totalBytesForUpdate - (totalBytesForUpdate % this.BlockSize);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z15, CipherParameters cipherParameters) {
        KeyParameter key;
        byte[] iv4;
        this.forEncryption = z15;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            key = aEADParameters.getKey();
            iv4 = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            int macSize = aEADParameters.getMacSize();
            int i15 = this.macSizeLowerBound;
            if (i15 == 0) {
                if (macSize != (this.MAC_SIZE << 3)) {
                    throw new IllegalArgumentException("Invalid value for MAC size: " + macSize);
                }
            } else {
                if (macSize > 128 || macSize < (i15 << 3) || (macSize & 7) != 0) {
                    throw new IllegalArgumentException("MAC size must be between " + (this.macSizeLowerBound << 3) + " and 128 bits for " + this.algorithmName);
                }
                this.MAC_SIZE = macSize >>> 3;
            }
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("invalid parameters passed to " + this.algorithmName);
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            key = (KeyParameter) parametersWithIV.getParameters();
            iv4 = parametersWithIV.getIV();
            this.initialAssociatedText = null;
        }
        if (key == null) {
            throw new IllegalArgumentException(this.algorithmName + " Init parameters must include a key");
        }
        if (iv4 == null || iv4.length != this.IV_SIZE) {
            throw new IllegalArgumentException(this.algorithmName + " requires exactly " + this.IV_SIZE + " bytes of IV");
        }
        byte[] key2 = key.getKey();
        if (key2.length != this.KEY_SIZE) {
            throw new IllegalArgumentException(this.algorithmName + " key must be " + this.KEY_SIZE + " bytes long");
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z15)));
        this.m_state = z15 ? State.EncInit : State.DecInit;
        init(key2, iv4);
        DataLimitCounter dataLimitCounter = this.dataLimitCounter;
        if (dataLimitCounter != null) {
            dataLimitCounter.increment(iv4.length);
        }
        reset(true);
        byte[] bArr = this.initialAssociatedText;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }

    protected abstract void init(byte[] bArr, byte[] bArr2);

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b15) {
        checkAAD();
        this.aadOperator.processAADByte(b15);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i15, int i16) {
        ensureSufficientInputBuffer(bArr, i15, i16);
        if (i16 <= 0) {
            return;
        }
        checkAAD();
        this.aadOperator.processAADBytes(bArr, i15, i16);
    }

    protected abstract void processBufferAAD(byte[] bArr, int i15);

    protected abstract void processBufferDecrypt(byte[] bArr, int i15, byte[] bArr2, int i16);

    protected abstract void processBufferEncrypt(byte[] bArr, int i15, byte[] bArr2, int i16);

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b15, byte[] bArr, int i15) {
        return this.dataOperator.processByte(b15, bArr, i15);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) {
        ensureSufficientInputBuffer(bArr, i15, i16);
        return this.dataOperator.processBytes(bArr, i15, i16, bArr2, i17);
    }

    protected int processEncDecByte(byte[] bArr, int i15) {
        if ((this.forEncryption ? this.BlockSize : this.m_bufferSizeDecrypt) - this.m_bufPos != 0) {
            return 0;
        }
        ensureSufficientOutputBuffer(bArr, i15, this.BlockSize);
        if (this.forEncryption) {
            processBufferEncrypt(this.m_buf, 0, bArr, i15);
        } else {
            processBufferDecrypt(this.m_buf, 0, bArr, i15);
            byte[] bArr2 = this.m_buf;
            int i16 = this.BlockSize;
            System.arraycopy(bArr2, i16, bArr2, 0, this.m_bufPos - i16);
        }
        int i17 = this.m_bufPos;
        int i18 = this.BlockSize;
        this.m_bufPos = i17 - i18;
        return i18;
    }

    protected int processEncDecBytes(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) {
        int i18;
        boolean zCheckData = checkData(false);
        int i19 = (zCheckData ? this.BlockSize : this.m_bufferSizeDecrypt) - this.m_bufPos;
        if (this.processor.isLengthWithinAvailableSpace(i16, i19)) {
            System.arraycopy(bArr, i15, this.m_buf, this.m_bufPos, i16);
            this.m_bufPos += i16;
            return 0;
        }
        int updateOutputSize = this.processor.getUpdateOutputSize(i16);
        int i25 = (this.m_bufPos + updateOutputSize) - (zCheckData ? 0 : this.MAC_SIZE);
        ensureSufficientOutputBuffer(bArr2, i17, i25 - (i25 % this.BlockSize));
        if (bArr == bArr2 && Arrays.segmentsOverlap(i15, i16, i17, updateOutputSize)) {
            bArr = new byte[i16];
            System.arraycopy(bArr2, i15, bArr, 0, i16);
            i15 = 0;
        }
        if (zCheckData) {
            int i26 = this.m_bufPos;
            if (i26 > 0) {
                System.arraycopy(bArr, i15, this.m_buf, i26, i19);
                i15 += i19;
                i16 -= i19;
                processBufferEncrypt(this.m_buf, 0, bArr2, i17);
                i18 = this.BlockSize;
            } else {
                i18 = 0;
            }
            while (this.processor.isLengthExceedingBlockSize(i16, this.BlockSize)) {
                processBufferEncrypt(bArr, i15, bArr2, i17 + i18);
                int i27 = this.BlockSize;
                i15 += i27;
                i16 -= i27;
                i18 += i27;
            }
        } else {
            i18 = 0;
            while (this.processor.isLengthExceedingBlockSize(this.m_bufPos, this.BlockSize) && this.processor.isLengthExceedingBlockSize(this.m_bufPos + i16, this.m_bufferSizeDecrypt)) {
                processBufferDecrypt(this.m_buf, i18, bArr2, i17 + i18);
                int i28 = this.m_bufPos;
                int i29 = this.BlockSize;
                this.m_bufPos = i28 - i29;
                i18 += i29;
            }
            int i35 = this.m_bufPos;
            if (i35 > 0) {
                byte[] bArr3 = this.m_buf;
                System.arraycopy(bArr3, i18, bArr3, 0, i35);
                if (this.processor.isLengthWithinAvailableSpace(this.m_bufPos + i16, this.m_bufferSizeDecrypt)) {
                    System.arraycopy(bArr, i15, this.m_buf, this.m_bufPos, i16);
                    this.m_bufPos += i16;
                    return i18;
                }
                int iMax = Math.max(this.BlockSize - this.m_bufPos, 0);
                System.arraycopy(bArr, i15, this.m_buf, this.m_bufPos, iMax);
                i15 += iMax;
                i16 -= iMax;
                processBufferDecrypt(this.m_buf, 0, bArr2, i17 + i18);
                i18 += this.BlockSize;
            }
            while (this.processor.isLengthExceedingBlockSize(i16, this.m_bufferSizeDecrypt)) {
                processBufferDecrypt(bArr, i15, bArr2, i17 + i18);
                int i36 = this.BlockSize;
                i15 += i36;
                i16 -= i36;
                i18 += i36;
            }
        }
        System.arraycopy(bArr, i15, this.m_buf, 0, i16);
        this.m_bufPos = i16;
        return i18;
    }

    protected abstract void processFinalAAD();

    protected abstract void processFinalBlock(byte[] bArr, int i15);

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        reset(true);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x002b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x002d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    /* JADX WARN: Code duplicated, block: B:17:0x0045  */
    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    /* JADX WARN: Code duplicated, block: B:22:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0071  */
    /* JADX WARN: Code duplicated, block: B:27:0x0074 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x0083  */
    /* JADX WARN: Code duplicated, block: B:32:0x0091  */
    /* JADX WARN: Code duplicated, block: B:33:0x009d  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a9  */
    protected void setInnerMembers(ProcessingBufferType processingBufferType, AADOperatorType aADOperatorType, DataOperatorType dataOperatorType) {
        AADProcessingBuffer bufferedAADProcessor;
        int i15;
        AADOperator defaultAADOperator;
        int i16;
        DataOperator defaultDataOperator;
        int i17 = processingBufferType.ord;
        if (i17 != 0) {
            if (i17 == 1) {
                bufferedAADProcessor = new ImmediateAADProcessor();
            }
            this.m_bufferSizeDecrypt = this.BlockSize + this.MAC_SIZE;
            i15 = aADOperatorType.ord;
            if (i15 != 0) {
                this.m_aad = new byte[this.AADBufferSize];
                defaultAADOperator = new DefaultAADOperator();
            } else if (i15 != 1) {
                this.m_aad = new byte[this.AADBufferSize];
                defaultAADOperator = new CounterAADOperator();
            } else {
                if (i15 != 2) {
                    if (i15 == 3) {
                        this.m_aad = new byte[this.AADBufferSize];
                        this.dataLimitCounter = new DataLimitCounter();
                        defaultAADOperator = new DataLimitAADOperator();
                    }
                    i16 = dataOperatorType.ord;
                    if (i16 != 0) {
                        this.m_buf = new byte[this.m_bufferSizeDecrypt];
                        defaultDataOperator = new DefaultDataOperator();
                    } else if (i16 != 1) {
                        this.m_buf = new byte[this.m_bufferSizeDecrypt];
                        defaultDataOperator = new CounterDataOperator();
                    } else if (i16 != 2) {
                        this.m_buf = new byte[this.MAC_SIZE];
                        defaultDataOperator = new StreamDataOperator();
                    } else if (i16 != 3) {
                        this.BlockSize = 0;
                        this.m_buf = new byte[this.m_bufferSizeDecrypt];
                        defaultDataOperator = new StreamCipherOperator();
                    } else {
                        if (i16 != 4) {
                            return;
                        }
                        this.m_buf = new byte[this.m_bufferSizeDecrypt];
                        defaultDataOperator = new DataLimitDataOperator();
                    }
                    this.dataOperator = defaultDataOperator;
                }
                this.AADBufferSize = 0;
                defaultAADOperator = new StreamAADOperator();
            }
            this.aadOperator = defaultAADOperator;
            i16 = dataOperatorType.ord;
            if (i16 != 0) {
                this.m_buf = new byte[this.m_bufferSizeDecrypt];
                defaultDataOperator = new DefaultDataOperator();
            } else if (i16 != 1) {
                this.m_buf = new byte[this.m_bufferSizeDecrypt];
                defaultDataOperator = new CounterDataOperator();
            } else if (i16 != 2) {
                this.m_buf = new byte[this.MAC_SIZE];
                defaultDataOperator = new StreamDataOperator();
            } else if (i16 != 3) {
                this.BlockSize = 0;
                this.m_buf = new byte[this.m_bufferSizeDecrypt];
                defaultDataOperator = new StreamCipherOperator();
            } else {
                if (i16 != 4) {
                    return;
                }
                this.m_buf = new byte[this.m_bufferSizeDecrypt];
                defaultDataOperator = new DataLimitDataOperator();
            }
            this.dataOperator = defaultDataOperator;
        }
        bufferedAADProcessor = new BufferedAADProcessor();
        this.processor = bufferedAADProcessor;
        this.m_bufferSizeDecrypt = this.BlockSize + this.MAC_SIZE;
        i15 = aADOperatorType.ord;
        if (i15 != 0) {
            this.m_aad = new byte[this.AADBufferSize];
            defaultAADOperator = new DefaultAADOperator();
        } else if (i15 != 1) {
            this.m_aad = new byte[this.AADBufferSize];
            defaultAADOperator = new CounterAADOperator();
        } else {
            if (i15 != 2) {
                if (i15 == 3) {
                    this.m_aad = new byte[this.AADBufferSize];
                    this.dataLimitCounter = new DataLimitCounter();
                    defaultAADOperator = new DataLimitAADOperator();
                }
                i16 = dataOperatorType.ord;
                if (i16 != 0) {
                    this.m_buf = new byte[this.m_bufferSizeDecrypt];
                    defaultDataOperator = new DefaultDataOperator();
                } else if (i16 != 1) {
                    this.m_buf = new byte[this.m_bufferSizeDecrypt];
                    defaultDataOperator = new CounterDataOperator();
                } else if (i16 != 2) {
                    this.m_buf = new byte[this.MAC_SIZE];
                    defaultDataOperator = new StreamDataOperator();
                } else if (i16 != 3) {
                    this.BlockSize = 0;
                    this.m_buf = new byte[this.m_bufferSizeDecrypt];
                    defaultDataOperator = new StreamCipherOperator();
                } else {
                    if (i16 != 4) {
                        return;
                    }
                    this.m_buf = new byte[this.m_bufferSizeDecrypt];
                    defaultDataOperator = new DataLimitDataOperator();
                }
                this.dataOperator = defaultDataOperator;
            }
            this.AADBufferSize = 0;
            defaultAADOperator = new StreamAADOperator();
        }
        this.aadOperator = defaultAADOperator;
        i16 = dataOperatorType.ord;
        if (i16 != 0) {
            this.m_buf = new byte[this.m_bufferSizeDecrypt];
            defaultDataOperator = new DefaultDataOperator();
        } else if (i16 != 1) {
            this.m_buf = new byte[this.m_bufferSizeDecrypt];
            defaultDataOperator = new CounterDataOperator();
        } else if (i16 != 2) {
            this.m_buf = new byte[this.MAC_SIZE];
            defaultDataOperator = new StreamDataOperator();
        } else if (i16 != 3) {
            this.BlockSize = 0;
            this.m_buf = new byte[this.m_bufferSizeDecrypt];
            defaultDataOperator = new StreamCipherOperator();
        } else {
            if (i16 != 4) {
                return;
            }
            this.m_buf = new byte[this.m_bufferSizeDecrypt];
            defaultDataOperator = new DataLimitDataOperator();
        }
        this.dataOperator = defaultDataOperator;
    }

    protected void reset(boolean z15) {
        ensureInitialized();
        if (z15) {
            this.mac = null;
        }
        byte[] bArr = this.m_buf;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
            this.m_bufPos = 0;
        }
        byte[] bArr2 = this.m_aad;
        if (bArr2 != null) {
            Arrays.fill(bArr2, (byte) 0);
            this.m_aadPos = 0;
        }
        switch (this.m_state.ord) {
            case 1:
            case 5:
                break;
            case 2:
            case 3:
            case 4:
                this.m_state = State.EncFinal;
                return;
            case 6:
            case 7:
            case 8:
                this.m_state = State.DecFinal;
                break;
            default:
                throw new IllegalStateException(getAlgorithmName() + " needs to be initialized");
        }
        this.aadOperator.reset();
        this.dataOperator.reset();
    }
}
