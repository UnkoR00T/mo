package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
abstract class yl extends jl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final CharSequence f30706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f30707d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f30708e = Integer.MAX_VALUE;

    protected yl(zl zlVar, CharSequence charSequence) {
        this.f30706c = charSequence;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.jl
    protected final /* bridge */ /* synthetic */ Object a() {
        int iD;
        int i15 = this.f30707d;
        while (true) {
            int i16 = this.f30707d;
            if (i16 == -1) {
                c();
                return null;
            }
            int iE = e(i16);
            if (iE == -1) {
                iE = this.f30706c.length();
                this.f30707d = -1;
                iD = -1;
            } else {
                iD = d(iE);
                this.f30707d = iD;
            }
            if (iD != i15) {
                if (i15 < iE) {
                    this.f30706c.charAt(i15);
                }
                if (i15 < iE) {
                    this.f30706c.charAt(iE - 1);
                }
                int i17 = this.f30708e;
                if (i17 == 1) {
                    iE = this.f30706c.length();
                    this.f30707d = -1;
                    if (iE > i15) {
                        this.f30706c.charAt(iE - 1);
                    }
                } else {
                    this.f30708e = i17 - 1;
                }
                return this.f30706c.subSequence(i15, iE).toString();
            }
            int i18 = iD + 1;
            this.f30707d = i18;
            if (i18 > this.f30706c.length()) {
                this.f30707d = -1;
            }
        }
    }

    abstract int d(int i15);

    abstract int e(int i15);
}
