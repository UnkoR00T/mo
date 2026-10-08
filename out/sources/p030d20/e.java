package p030d20;

import android.content.Context;
import androidx.compose.ui.platform.v2;
import androidx.compose.ui.platform.x2;
import java.util.List;
import m3.g;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import px.a;
import px.f;
import t70.i;
import t70.z;
import yw.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\tJW\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00122\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00122\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00122\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018Jg\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00122\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00122\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00122\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00122\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR$\u0010$\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010&¨\u0006("}, d2 = {"Ld20/e;", "Landroidx/compose/ui/platform/v2;", "platformToolbar", "Landroid/content/Context;", "context", "<init>", "(Landroidx/compose/ui/platform/v2;Landroid/content/Context;)V", "Loq/i0;", "f", "()V", "g", "", "Lpx/a;", "a", "()Ljava/util/List;", "c", "Lm3/g;", "rect", "Lkotlin/Function0;", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "e", "(Lm3/g;Ler/a;Ler/a;Ler/a;Ler/a;)V", "onAutofillRequested", "d", "(Lm3/g;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "Landroidx/compose/ui/platform/v2;", "getPlatformToolbar", "()Landroidx/compose/ui/platform/v2;", "Landroidx/compose/ui/platform/x2;", "value", "b", "Landroidx/compose/ui/platform/x2;", "()Landroidx/compose/ui/platform/x2;", "status", "Lyw/b;", "Lyw/b;", "talkBackManager", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v2 platformToolbar;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private x2 status = x2.Hidden;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b talkBackManager;

    public e(v2 v2Var, Context context) {
        this.platformToolbar = v2Var;
        this.talkBackManager = i.u(context);
    }

    private final List<a> a() {
        return v.q(z.f188762a.a(), new a.Class(this));
    }

    private final void f() {
        x2 status = getStatus();
        x2 x2Var = x2.Hidden;
        if (status != x2Var) {
            f.f163100a.b("TextToolbar hidden", a());
            this.status = x2Var;
        }
    }

    private final void g() {
        x2 status = getStatus();
        x2 x2Var = x2.Shown;
        if (status != x2Var) {
            f.f163100a.b("TextToolbar shown, announcing", a());
            this.talkBackManager.a(c70.a.f23835a.a().k().getText());
            this.status = x2Var;
        }
    }

    @Override // androidx.compose.ui.platform.v2
    /* JADX INFO: renamed from: b, reason: from getter */
    public x2 getStatus() {
        return this.status;
    }

    @Override // androidx.compose.ui.platform.v2
    public void c() {
        f();
        this.platformToolbar.c();
    }

    @Override // androidx.compose.ui.platform.v2
    public void d(g rect, er.a<i0> onCopyRequested, er.a<i0> onPasteRequested, er.a<i0> onCutRequested, er.a<i0> onSelectAllRequested, er.a<i0> onAutofillRequested) {
        g();
        this.platformToolbar.d(rect, onCopyRequested, onPasteRequested, onCutRequested, onSelectAllRequested, onAutofillRequested);
    }

    @Override // androidx.compose.ui.platform.v2
    public void e(g rect, er.a<i0> onCopyRequested, er.a<i0> onPasteRequested, er.a<i0> onCutRequested, er.a<i0> onSelectAllRequested) {
        g();
        this.platformToolbar.e(rect, onCopyRequested, onPasteRequested, onCutRequested, onSelectAllRequested);
    }
}
