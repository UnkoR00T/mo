package so;

import java.io.File;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends j0 {
    public a0(boolean z15) {
        this(z15, false);
    }

    @Override // so.j0
    protected boolean a() {
        return true;
    }

    @Override // so.j0
    protected l0 h(n0 n0Var, String str) {
        if (str.equals("BASE") || str.equals("GDEF") || str.equals("GPOS") || str.equals("GSUB") || str.equals("JSTF")) {
            return new b0(n0Var);
        }
        return str.equals("CFF ") ? new b(n0Var) : super.h(n0Var, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // so.j0
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public c0 b(i0 i0Var) {
        return new c0(i0Var);
    }

    @Override // so.j0
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public c0 c(File file) {
        return (c0) super.c(file);
    }

    @Override // so.j0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public c0 d(InputStream inputStream) {
        return (c0) super.d(inputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // so.j0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public c0 e(i0 i0Var) {
        return (c0) super.e(i0Var);
    }

    public a0(boolean z15, boolean z16) {
        super(z15, z16);
    }
}
