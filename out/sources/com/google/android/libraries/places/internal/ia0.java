package com.google.android.libraries.places.internal;

import java.io.InputStream;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ia0 implements jm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f32560a = Logger.getLogger(ia0.class.getName());

    @Override // com.google.android.libraries.places.internal.jm0
    public final void I() {
        if (f().a()) {
            return;
        }
        f().zzb();
    }

    @Override // com.google.android.libraries.places.internal.jm0
    public final void a(int i15) {
        ha0 ha0VarG = g();
        ha0VarG.d(new ga0(ha0VarG, fr0.b(), i15));
    }

    @Override // com.google.android.libraries.places.internal.jm0
    public final void b(x40 x40Var) {
        f().d((x40) zj.p.r(x40Var, "compressor"));
    }

    @Override // com.google.android.libraries.places.internal.jm0
    public final void d(InputStream inputStream) {
        zj.p.r(inputStream, "message");
        try {
            if (!f().a()) {
                f().e(inputStream);
            }
        } finally {
            ze0.h(inputStream);
        }
    }

    @Override // com.google.android.libraries.places.internal.jm0
    public final void e() {
        g().j();
    }

    protected abstract oe0 f();

    protected abstract ha0 g();

    protected final void i(int i15) {
        g().s(i15);
    }
}
