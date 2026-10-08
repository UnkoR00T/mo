package org.conscrypt;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BufferAllocator {
    private static final BufferAllocator UNPOOLED = new BufferAllocator() { // from class: org.conscrypt.BufferAllocator.1
        @Override // org.conscrypt.BufferAllocator
        public AllocatedBuffer allocateDirectBuffer(int i15) {
            return AllocatedBuffer.wrap(ByteBuffer.allocateDirect(i15));
        }

        @Override // org.conscrypt.BufferAllocator
        public AllocatedBuffer allocateHeapBuffer(int i15) {
            return AllocatedBuffer.wrap(ByteBuffer.allocate(i15));
        }
    };

    public static BufferAllocator unpooled() {
        return UNPOOLED;
    }

    public abstract AllocatedBuffer allocateDirectBuffer(int i15);

    public abstract AllocatedBuffer allocateHeapBuffer(int i15);
}
