package gk;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i0 f73331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final uk.b f73332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final uk.a f73333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f73334d;

    private g0(i0 i0Var, uk.b bVar, uk.a aVar, Integer num) {
        this.f73331a = i0Var;
        this.f73332b = bVar;
        this.f73333c = aVar;
        this.f73334d = num;
    }

    public static g0 a(i0.a aVar, uk.b bVar, Integer num) throws GeneralSecurityException {
        i0.a aVar2 = i0.a.f73352d;
        if (aVar != aVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        }
        if (aVar == aVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (bVar.b() == 32) {
            i0 i0VarA = i0.a(aVar);
            return new g0(i0VarA, bVar, b(i0VarA, num), num);
        }
        throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + bVar.b());
    }

    private static uk.a b(i0 i0Var, Integer num) {
        if (i0Var.b() == i0.a.f73352d) {
            return uk.a.a(new byte[0]);
        }
        if (i0Var.b() == i0.a.f73351c) {
            return uk.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        }
        if (i0Var.b() == i0.a.f73350b) {
            return uk.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        throw new IllegalStateException("Unknown Variant: " + i0Var.b());
    }
}
