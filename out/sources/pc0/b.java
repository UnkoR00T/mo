package pc0;

import androidx.compose.ui.graphics.Color;
import cb4.DialogButtonTextData;
import cb4.DialogData;
import cb4.h;
import cb4.i;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import k30.d;
import lc0.LoginThemeColors;
import mx.c;
import oc0.e;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00102\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lpc0/b;", "Lxw/f;", "Lpc0/b$a;", "Loc0/f$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "Loc0/f$a$a;", "e", "(Lpc0/b$a;)Loc0/f$a$a;", "Lkotlin/Function0;", "Loq/i0;", "toReactivateApp", "dismissDialog", "Lcb4/d;", "i", "(Ler/a;Ler/a;)Lcb4/d;", "h", "(Lpc0/b$a;)Loc0/f$a;", "a", "Lmx/c;", "login_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, oc0.f.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: pc0.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Lpc0/b$a;", "", "Loc0/e;", "state", "Lkotlin/Function0;", "Loq/i0;", "deactivateAction", "backAction", "Lkotlin/Function1;", "Lcb4/d;", "showDialog", "<init>", "(Loc0/e;Ler/a;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Loc0/e;", "d", "()Loc0/e;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "login_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final e state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> deactivateAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<DialogData, i0> showDialog;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(e eVar, er.a<i0> aVar, er.a<i0> aVar2, l<? super DialogData, i0> lVar) {
            this.state = eVar;
            this.deactivateAction = aVar;
            this.backAction = aVar2;
            this.showDialog = lVar;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final er.a<i0> b() {
            return this.deactivateAction;
        }

        public final l<DialogData, i0> c() {
            return this.showDialog;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final e getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.deactivateAction, params.deactivateAction) && t.c(this.backAction, params.backAction) && t.c(this.showDialog, params.showDialog);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.deactivateAction.hashCode()) * 31) + this.backAction.hashCode()) * 31) + this.showDialog.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", deactivateAction=" + this.deactivateAction + ", backAction=" + this.backAction + ", showDialog=" + this.showDialog + ')';
        }
    }

    /* JADX INFO: renamed from: pc0.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C3818b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3818b f154159a = new C3818b();

        C3818b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1004304933);
            if (p076m2.t.k()) {
                p076m2.t.o(1004304933, i15, -1, "pl.gov.coi.mjunior.feature.login.presentation.screen.lostpin.mapper.LostPinMapper.getInitializedScreenData.<anonymous> (LostPinMapper.kt:56)");
            }
            long headerIconBackground = ((LoginThemeColors) rVar.N(lc0.e.e())).getHeaderIconBackground();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return headerIconBackground;
        }
    }

    public b(c cVar) {
        this.labelProvider = cVar;
    }

    private final oc0.f.a.LostPinData e(final Params params) {
        i vmsAdapter;
        e state = params.getState();
        if (state instanceof e.Dialog) {
            vmsAdapter = ((e.Dialog) params.getState()).getVmsAdapter();
        } else {
            if (!t.c(state, e.b.f144583a)) {
                throw new oq.p();
            }
            vmsAdapter = null;
        }
        return new oc0.f.a.LostPinData(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), null, null, null, null, 30, null), null, null, null, null, 61, null), vmsAdapter, new o40.a.Icon(jz.a.f106767f, null, C3818b.f154159a, this.labelProvider.c(jc0.a.f101414u), this.labelProvider.c(jc0.a.f101413t), null, 34, null), this.labelProvider.c(jc0.a.f101412s), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(jc0.a.f101411r), null, 2, null), d.a.f107773a, null, new er.a() { // from class: pc0.a
            @Override // er.a
            public final Object a() {
                return b.f(params, this);
            }
        }, 35, null), params.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, b bVar) {
        params.c().b(bVar.i(params.b(), params.a()));
        return i0.f148189a;
    }

    private final DialogData i(er.a<i0> toReactivateApp, er.a<i0> dismissDialog) {
        return new DialogData(h.b.f24985a, this.labelProvider.c(jc0.a.f101416w), this.labelProvider.c(jc0.a.f101415v), new DialogButtonTextData(this.labelProvider.c(jc0.a.f101399f), null, toReactivateApp, 2, null), new DialogButtonTextData(this.labelProvider.c(jc0.a.f101401h), null, dismissDialog, 2, null), null, null, 96, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public oc0.f.a b(Params params) {
        e state = params.getState();
        if (!t.c(state, e.b.f144583a) && !(state instanceof e.Dialog)) {
            throw new oq.p();
        }
        return e(params);
    }
}
