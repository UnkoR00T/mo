package b13;

import a13.State;
import androidx.compose.ui.graphics.Color;
import er.p;
import fr.k;
import fr.t;
import h30.ButtonData;
import i30.ButtonIconData;
import i50.BaseScaffoldData;
import k30.d;
import mx.b;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0015\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lb13/a;", "Lxw/f;", "Lb13/a$b;", "La13/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lkotlin/Function0;", "Loq/i0;", "backAction", "Li50/a;", "c", "(Ler/a;)Li50/a;", "params", "e", "(Lb13/a$b;)La13/c$a;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "b", "safebus_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, a13.c.Data> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C0380a f16124b = new C0380a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16125c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b13.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb13/a$a;", "", "<init>", "()V", "", "SCANNED_PLATE_TAG", "Ljava/lang/String;", "safebus_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class C0380a {
        public /* synthetic */ C0380a(k kVar) {
            this();
        }

        private C0380a() {
        }
    }

    /* JADX INFO: renamed from: b13.a$b, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lb13/a$b;", "", "La13/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "backAction", "usePlateNumberAction", "<init>", "(La13/b;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "La13/b;", "b", "()La13/b;", "Ler/a;", "()Ler/a;", "c", "safebus_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> usePlateNumberAction;

        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = state;
            this.backAction = aVar;
            this.usePlateNumberAction = aVar2;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public final er.a<i0> c() {
            return this.usePlateNumberAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.backAction, params.backAction) && t.c(this.usePlateNumberAction, params.usePlateNumberAction);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.backAction.hashCode()) * 31) + this.usePlateNumberAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", backAction=" + this.backAction + ", usePlateNumberAction=" + this.usePlateNumberAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f16130a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1811726765);
            if (p076m2.t.k()) {
                p076m2.t.o(1811726765, i15, -1, "pl.gov.coi.mobywatel.feature.safebus.presentation.platescanner.mapper.SafeBusPlateScannerMapper.invoke.<anonymous> (SafeBusPlateScannerMapper.kt:52)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public a(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final BaseScaffoldData c(er.a<i0> backAction) {
        return new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), backAction), this.labelProvider.c(k03.a.M), null, null, null, 28, null), null, null, null, null, 61, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public a13.c.Data b(Params params) {
        return new a13.c.Data(c(params.a()), this.labelProvider.c(k03.a.L), null, this.labelProvider.c(k03.a.K), b.b(params.getState().getPlate(), "scannedPlate"), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(k03.a.J), null, 2, null), d.a.f107773a, uv0.d.g(params.getState().getPlate()) ? k30.b.c.f107768a : k30.b.C2562b.f107767a, params.c(), 3, null), new ButtonIconData(null, jz.a.U, c.f16130a, null, null, params.a(), 25, null), params.getState().getCameraPreviewViewConnector(), 4, null);
    }
}
