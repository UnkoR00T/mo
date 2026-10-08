package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.a.AbstractC0757a;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0757a<MessageType, BuilderType>> implements r0 {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0757a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0757a<MessageType, BuilderType>> implements r0.a {
        protected static m1 p(r0 r0Var) {
            return new m1(r0Var);
        }

        protected abstract BuilderType n(MessageType messagetype);

        @Override // com.google.crypto.tink.shaded.protobuf.r0.a
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public BuilderType D1(r0 r0Var) {
            if (i().getClass().isInstance(r0Var)) {
                return (BuilderType) n((a) r0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    private String f(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    int a() {
        throw new UnsupportedOperationException();
    }

    int d(g1 g1Var) {
        int iA = a();
        if (iA != -1) {
            return iA;
        }
        int iG = g1Var.g(this);
        k(iG);
        return iG;
    }

    m1 h() {
        return new m1(this);
    }

    void k(int i15) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public h l() {
        try {
            h.C0758h c0758hU = h.u(e());
            m(c0758hU.b());
            return c0758hU.a();
        } catch (IOException e15) {
            throw new RuntimeException(f("ByteString"), e15);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[e()];
            k kVarC0 = k.c0(bArr);
            m(kVarC0);
            kVarC0.c();
            return bArr;
        } catch (IOException e15) {
            throw new RuntimeException(f("byte array"), e15);
        }
    }
}
