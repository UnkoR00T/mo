package nk;

import java.security.GeneralSecurityException;
import sk.i0;
import sk.y;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f137075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final uk.a f137076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.crypto.tink.shaded.protobuf.h f137077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final y.c f137078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i0 f137079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Integer f137080f;

    private o(String str, com.google.crypto.tink.shaded.protobuf.h hVar, y.c cVar, i0 i0Var, Integer num) {
        this.f137075a = str;
        this.f137076b = t.e(str);
        this.f137077c = hVar;
        this.f137078d = cVar;
        this.f137079e = i0Var;
        this.f137080f = num;
    }

    public static o b(String str, com.google.crypto.tink.shaded.protobuf.h hVar, y.c cVar, i0 i0Var, Integer num) throws GeneralSecurityException {
        if (i0Var == i0.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new o(str, hVar, cVar, i0Var, num);
    }

    @Override // nk.q
    public uk.a a() {
        return this.f137076b;
    }

    public Integer c() {
        return this.f137080f;
    }

    public y.c d() {
        return this.f137078d;
    }

    public i0 e() {
        return this.f137079e;
    }

    public String f() {
        return this.f137075a;
    }

    public com.google.crypto.tink.shaded.protobuf.h g() {
        return this.f137077c;
    }
}
