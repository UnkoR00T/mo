package ec4;

import android.content.Context;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lec4/i0;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lgy/a;", "permissionManager", "Ls00/b;", "edoNfcTagReader", "Ls00/a;", "a", "(Landroid/content/Context;Lgy/a;Ls00/b;)Ls00/a;", "Lcy/a;", "nfcManager", "Lac4/k;", "d", "(Lcy/a;)Lac4/k;", "Lkx/d;", "intentActionManager", "Lmx/c;", "labelProvider", "Lac4/i;", "c", "(Lkx/d;Lmx/c;)Lac4/i;", "Lac4/l;", "e", "(Lcy/a;)Lac4/l;", "androidNfcManager", "Lac4/b;", "b", "(Ls00/a;)Lac4/b;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f49439a = new i0();

    private i0() {
    }

    public final s00.a a(Context context, gy.a permissionManager, s00.b edoNfcTagReader) {
        return new s00.a(context, permissionManager, edoNfcTagReader);
    }

    public final ac4.b b(s00.a androidNfcManager) {
        return new gc4.b(androidNfcManager);
    }

    public final ac4.i c(kx.d intentActionManager, mx.c labelProvider) {
        return new gc4.f(intentActionManager, labelProvider);
    }

    public final ac4.k d(cy.a nfcManager) {
        return new gc4.i(nfcManager);
    }

    public final ac4.l e(cy.a nfcManager) {
        return new gc4.j(nfcManager);
    }
}
