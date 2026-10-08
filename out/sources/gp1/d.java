package gp1;

import fr.t;
import g70.ShortcutMoreData;
import g70.ShortcutMoreTransferData;
import h70.ShortcutsLayoutData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import o50.SmallCardData;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lgp1/d;", "Lxw/f;", "Lgp1/d$a;", "Lgp1/c$a;", "<init>", "()V", "params", "c", "(Lgp1/d$a;)Lgp1/c$a;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements xw.f<Params, c.Data> {

    /* JADX INFO: renamed from: gp1.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00050\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010#R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\"\u001a\u0004\b$\u0010#R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010#R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b(\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b&\u0010#R)\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b'\u0010*\u001a\u0004\b)\u0010+R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b!\u0010#¨\u0006,"}, d2 = {"Lgp1/d$a;", "", "Lgp1/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "toConfirmIdentity", "toMbiznes", "toRestrictPesel", "toVerifyPesel", "toDeleteDocument", "Lkotlin/Function1;", "", "Lg70/b;", "toMoreDialog", "onSnackBarHidden", "<init>", "(Lgp1/b;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgp1/b;", "c", "()Lgp1/b;", "b", "Ler/a;", "()Ler/a;", "d", "f", "e", "h", "i", "g", "Ler/l;", "()Ler/l;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> toConfirmIdentity;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> toMbiznes;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> toRestrictPesel;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> toVerifyPesel;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> toDeleteDocument;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<List<ShortcutMoreTransferData>, i0> toMoreDialog;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSnackBarHidden;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, er.a<i0> aVar6, er.l<? super List<ShortcutMoreTransferData>, i0> lVar, er.a<i0> aVar7) {
            this.state = state;
            this.onBackAction = aVar;
            this.toConfirmIdentity = aVar2;
            this.toMbiznes = aVar3;
            this.toRestrictPesel = aVar4;
            this.toVerifyPesel = aVar5;
            this.toDeleteDocument = aVar6;
            this.toMoreDialog = lVar;
            this.onSnackBarHidden = aVar7;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onSnackBarHidden;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public final er.a<i0> d() {
            return this.toConfirmIdentity;
        }

        public final er.a<i0> e() {
            return this.toDeleteDocument;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.toConfirmIdentity, params.toConfirmIdentity) && t.c(this.toMbiznes, params.toMbiznes) && t.c(this.toRestrictPesel, params.toRestrictPesel) && t.c(this.toVerifyPesel, params.toVerifyPesel) && t.c(this.toDeleteDocument, params.toDeleteDocument) && t.c(this.toMoreDialog, params.toMoreDialog) && t.c(this.onSnackBarHidden, params.onSnackBarHidden);
        }

        public final er.a<i0> f() {
            return this.toMbiznes;
        }

        public final er.l<List<ShortcutMoreTransferData>, i0> g() {
            return this.toMoreDialog;
        }

        public final er.a<i0> h() {
            return this.toRestrictPesel;
        }

        public int hashCode() {
            return (((((((((((((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.toConfirmIdentity.hashCode()) * 31) + this.toMbiznes.hashCode()) * 31) + this.toRestrictPesel.hashCode()) * 31) + this.toVerifyPesel.hashCode()) * 31) + this.toDeleteDocument.hashCode()) * 31) + this.toMoreDialog.hashCode()) * 31) + this.onSnackBarHidden.hashCode();
        }

        public final er.a<i0> i() {
            return this.toVerifyPesel;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", toConfirmIdentity=" + this.toConfirmIdentity + ", toMbiznes=" + this.toMbiznes + ", toRestrictPesel=" + this.toRestrictPesel + ", toVerifyPesel=" + this.toVerifyPesel + ", toDeleteDocument=" + this.toDeleteDocument + ", toMoreDialog=" + this.toMoreDialog + ", onSnackBarHidden=" + this.onSnackBarHidden + ')';
        }
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c.Data b(Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), mx.b.b("Shortcuts Row", ""), null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelB = mx.b.b("Potwierdź swoje dane", "");
        int i15 = jz.a.f106785h1;
        o50.f.c cVar = o50.f.c.f142478a;
        return new c.Data(baseScaffoldData, new ShortcutsLayoutData(v.q(new SmallCardData(null, labelB, null, i15, cVar, false, params.d(), 37, null), new SmallCardData(null, mx.b.b("Firma", ""), null, jz.a.f106778g2, cVar, false, params.f(), 37, null), new SmallCardData(null, mx.b.b("Zastrzeż pesel", ""), null, jz.a.f106854r0, cVar, false, params.h(), 37, null), new SmallCardData(null, mx.b.b("Weryfikuj pesel", ""), null, jz.a.f106847q0, cVar, false, params.i(), 37, null), new SmallCardData(null, mx.b.b("Usuń dokument", ""), null, jz.a.f106727a, o50.f.b.f142477a, false, params.e(), 37, null)), new ShortcutMoreData(mx.b.b("Pozostałe skróty", ""), params.g())), params.getState().getSnackBarState(), params.b());
    }
}
