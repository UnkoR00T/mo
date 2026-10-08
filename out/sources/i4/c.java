package i4;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import fr.k;
import m3.g;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0001\u0018\u00002\u00020\u0001B}\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001a\u0010\u0019J!\u0010\u001c\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\"\u0010#R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010$\u001a\u0004\b,\u0010&\"\u0004\b-\u0010.R*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010$\u001a\u0004\b/\u0010&\"\u0004\b0\u0010.R*\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010$\u001a\u0004\b1\u0010&\"\u0004\b2\u0010.R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010$\u001a\u0004\b3\u0010&\"\u0004\b4\u0010.R*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010$\u001a\u0004\b5\u0010&\"\u0004\b6\u0010.¨\u00067"}, d2 = {"Li4/c;", "", "Lkotlin/Function0;", "Loq/i0;", "onActionModeDestroy", "Lm3/g;", "rect", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "onAutofillRequested", "<init>", "(Ler/a;Lm3/g;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "Landroid/view/Menu;", "menu", "Li4/b;", "item", "callback", "b", "(Landroid/view/Menu;Li4/b;Ler/a;)V", "Landroid/view/ActionMode;", "mode", "", "e", "(Landroid/view/ActionMode;Landroid/view/Menu;)Z", "g", "Landroid/view/MenuItem;", "d", "(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z", "f", "()V", "n", "(Landroid/view/Menu;)V", "a", "(Landroid/view/Menu;Li4/b;)V", "Ler/a;", "getOnActionModeDestroy", "()Ler/a;", "Lm3/g;", "c", "()Lm3/g;", "m", "(Lm3/g;)V", "getOnCopyRequested", "i", "(Ler/a;)V", "getOnPasteRequested", "k", "getOnCutRequested", "j", "getOnSelectAllRequested", "l", "getOnAutofillRequested", "h", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final er.a<i0> onActionModeDestroy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private g rect;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private er.a<i0> onCopyRequested;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private er.a<i0> onPasteRequested;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private er.a<i0> onCutRequested;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private er.a<i0> onSelectAllRequested;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private er.a<i0> onAutofillRequested;

    public c(er.a<i0> aVar, g gVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, er.a<i0> aVar6) {
        this.onActionModeDestroy = aVar;
        this.rect = gVar;
        this.onCopyRequested = aVar2;
        this.onPasteRequested = aVar3;
        this.onCutRequested = aVar4;
        this.onSelectAllRequested = aVar5;
        this.onAutofillRequested = aVar6;
    }

    private final void b(Menu menu, b item, er.a<i0> callback) {
        if (callback != null && menu.findItem(item.getId()) == null) {
            a(menu, item);
        } else {
            if (callback != null || menu.findItem(item.getId()) == null) {
                return;
            }
            menu.removeItem(item.getId());
        }
    }

    public final void a(Menu menu, b item) {
        menu.add(0, item.getId(), item.getOrder(), item.j()).setShowAsAction(1);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final g getRect() {
        return this.rect;
    }

    public final boolean d(ActionMode mode, MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == b.Copy.getId()) {
            er.a<i0> aVar = this.onCopyRequested;
            if (aVar != null) {
                aVar.a();
            }
        } else if (itemId == b.Paste.getId()) {
            er.a<i0> aVar2 = this.onPasteRequested;
            if (aVar2 != null) {
                aVar2.a();
            }
        } else if (itemId == b.Cut.getId()) {
            er.a<i0> aVar3 = this.onCutRequested;
            if (aVar3 != null) {
                aVar3.a();
            }
        } else if (itemId == b.SelectAll.getId()) {
            er.a<i0> aVar4 = this.onSelectAllRequested;
            if (aVar4 != null) {
                aVar4.a();
            }
        } else {
            if (itemId != b.Autofill.getId()) {
                return false;
            }
            er.a<i0> aVar5 = this.onAutofillRequested;
            if (aVar5 != null) {
                aVar5.a();
            }
        }
        if (mode == null) {
            return true;
        }
        mode.finish();
        return true;
    }

    public final boolean e(ActionMode mode, Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (mode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        if (this.onCopyRequested != null) {
            a(menu, b.Copy);
        }
        if (this.onPasteRequested != null) {
            a(menu, b.Paste);
        }
        if (this.onCutRequested != null) {
            a(menu, b.Cut);
        }
        if (this.onSelectAllRequested != null) {
            a(menu, b.SelectAll);
        }
        if (this.onAutofillRequested == null) {
            return true;
        }
        a(menu, b.Autofill);
        return true;
    }

    public final void f() {
        er.a<i0> aVar = this.onActionModeDestroy;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final boolean g(ActionMode mode, Menu menu) {
        if (mode == null || menu == null) {
            return false;
        }
        n(menu);
        return true;
    }

    public final void h(er.a<i0> aVar) {
        this.onAutofillRequested = aVar;
    }

    public final void i(er.a<i0> aVar) {
        this.onCopyRequested = aVar;
    }

    public final void j(er.a<i0> aVar) {
        this.onCutRequested = aVar;
    }

    public final void k(er.a<i0> aVar) {
        this.onPasteRequested = aVar;
    }

    public final void l(er.a<i0> aVar) {
        this.onSelectAllRequested = aVar;
    }

    public final void m(g gVar) {
        this.rect = gVar;
    }

    public final void n(Menu menu) {
        b(menu, b.Copy, this.onCopyRequested);
        b(menu, b.Paste, this.onPasteRequested);
        b(menu, b.Cut, this.onCutRequested);
        b(menu, b.SelectAll, this.onSelectAllRequested);
        b(menu, b.Autofill, this.onAutofillRequested);
    }

    public /* synthetic */ c(er.a aVar, g gVar, er.a aVar2, er.a aVar3, er.a aVar4, er.a aVar5, er.a aVar6, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : aVar, (i15 & 2) != 0 ? g.INSTANCE.a() : gVar, (i15 & 4) != 0 ? null : aVar2, (i15 & 8) != 0 ? null : aVar3, (i15 & 16) != 0 ? null : aVar4, (i15 & 32) != 0 ? null : aVar5, (i15 & 64) != 0 ? null : aVar6);
    }
}
