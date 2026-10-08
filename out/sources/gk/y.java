package gk;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f73414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final uk.b f73415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final uk.a f73416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f73417d;

    private y(a0 a0Var, uk.b bVar, uk.a aVar, Integer num) {
        this.f73414a = a0Var;
        this.f73415b = bVar;
        this.f73416c = aVar;
        this.f73417d = num;
    }

    public static y a(a0.a aVar, uk.b bVar, Integer num) throws GeneralSecurityException {
        a0.a aVar2 = a0.a.f73304d;
        if (aVar != aVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        }
        if (aVar == aVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (bVar.b() == 32) {
            a0 a0VarA = a0.a(aVar);
            return new y(a0VarA, bVar, b(a0VarA, num), num);
        }
        throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + bVar.b());
    }

    private static uk.a b(a0 a0Var, Integer num) {
        if (a0Var.b() == a0.a.f73304d) {
            return uk.a.a(new byte[0]);
        }
        if (a0Var.b() == a0.a.f73303c) {
            return uk.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        }
        if (a0Var.b() == a0.a.f73302b) {
            return uk.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        throw new IllegalStateException("Unknown Variant: " + a0Var.b());
    }
}
