package j83;

import androidx.compose.ui.graphics.Color;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import i83.State;
import i83.g;
import j30.ButtonTextData;
import java.util.List;
import k30.d;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lj83/a;", "Lxw/f;", "Lj83/a$a;", "Li83/g$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lj83/a$a;)Li83/g$a;", "a", "Lmx/c;", "studentschoolcardactivation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, g.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: j83.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u0016\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001a\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, d2 = {"Lj83/a$a;", "", "Li83/f;", "state", "Lkotlin/Function0;", "Loq/i0;", "onTopBarInfoIconClick", "onBackPressed", "onNextButtonClick", "onQrCodeInfoClick", "<init>", "(Li83/f;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li83/f;", "e", "()Li83/f;", "b", "Ler/a;", "d", "()Ler/a;", "c", "studentschoolcardactivation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onTopBarInfoIconClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackPressed;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextButtonClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onQrCodeInfoClick;

        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = state;
            this.onTopBarInfoIconClick = aVar;
            this.onBackPressed = aVar2;
            this.onNextButtonClick = aVar3;
            this.onQrCodeInfoClick = aVar4;
        }

        public final er.a<i0> a() {
            return this.onBackPressed;
        }

        public final er.a<i0> b() {
            return this.onNextButtonClick;
        }

        public final er.a<i0> c() {
            return this.onQrCodeInfoClick;
        }

        public final er.a<i0> d() {
            return this.onTopBarInfoIconClick;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final State getState() {
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
            return t.c(this.state, params.state) && t.c(this.onTopBarInfoIconClick, params.onTopBarInfoIconClick) && t.c(this.onBackPressed, params.onBackPressed) && t.c(this.onNextButtonClick, params.onNextButtonClick) && t.c(this.onQrCodeInfoClick, params.onQrCodeInfoClick);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onTopBarInfoIconClick.hashCode()) * 31) + this.onBackPressed.hashCode()) * 31) + this.onNextButtonClick.hashCode()) * 31) + this.onQrCodeInfoClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onTopBarInfoIconClick=" + this.onTopBarInfoIconClick + ", onBackPressed=" + this.onBackPressed + ", onNextButtonClick=" + this.onNextButtonClick + ", onQrCodeInfoClick=" + this.onQrCodeInfoClick + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f100307a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(522302032);
            if (p076m2.t.k()) {
                p076m2.t.o(522302032, i15, -1, "pl.gov.coi.mobywatel.feature.studentschoolcardactivation.presentation.welcome.mapper.WelcomeScreenMapper.invoke.<anonymous> (WelcomeScreenMapper.kt:55)");
            }
            long jA = ((z73.a) rVar.N(z73.c.c())).a();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jA;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f100308a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1903008135);
            if (p076m2.t.k()) {
                p076m2.t.o(-1903008135, i15, -1, "pl.gov.coi.mobywatel.feature.studentschoolcardactivation.presentation.welcome.mapper.WelcomeScreenMapper.invoke.<anonymous> (WelcomeScreenMapper.kt:68)");
            }
            long jB = ((z73.a) rVar.N(z73.c.c())).b();
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

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g.Data b(Params params) {
        o40.a.Icon icon;
        List listQ;
        int i15;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(n73.a.f133461h0), null, params.getState().getActivationProcessType() instanceof k83.a.InterfaceC2600a ? null : new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216848d, null, null, params.d(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        k83.a activationProcessType = params.getState().getActivationProcessType();
        if (activationProcessType instanceof k83.a.b) {
            int i16 = jz.a.Q2;
            b bVar = b.f100307a;
            mx.c cVar = this.labelProvider;
            k83.a.b bVar2 = (k83.a.b) activationProcessType;
            if (t.c(bVar2, k83.a.b.C2602a.f109186a)) {
                i15 = n73.a.f133465j0;
            } else {
                if (!t.c(bVar2, k83.a.b.C2603b.f109187a)) {
                    throw new oq.p();
                }
                i15 = n73.a.f133453d0;
            }
            icon = new o40.a.Icon(i16, null, bVar, cVar.c(i15), this.labelProvider.c(n73.a.f133463i0), null, 34, null);
        } else {
            if (!(activationProcessType instanceof k83.a.InterfaceC2600a)) {
                throw new oq.p();
            }
            icon = new o40.a.Icon(jz.a.P2, null, c.f100308a, this.labelProvider.c(n73.a.f133477v), this.labelProvider.c(n73.a.f133476u), null, 34, null);
        }
        k83.a activationProcessType2 = params.getState().getActivationProcessType();
        if (activationProcessType2 instanceof k83.a.b) {
            listQ = v.q(this.labelProvider.c(n73.a.f133455e0), this.labelProvider.c(n73.a.f133457f0), this.labelProvider.c(n73.a.f133459g0));
        } else {
            if (!(activationProcessType2 instanceof k83.a.InterfaceC2600a)) {
                throw new oq.p();
            }
            listQ = v.q(this.labelProvider.c(n73.a.f133470o), this.labelProvider.c(n73.a.f133471p));
        }
        return new g.Data(baseScaffoldData, icon, listQ, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(n73.a.f133454e), null, 2, null), d.a.f107773a, null, params.b(), 35, null), params.getState().getActivationProcessType() instanceof k83.a.InterfaceC2600a ? new ButtonTextData(null, this.labelProvider.c(n73.a.f133475t), null, null, params.c(), 13, null) : null, params.a());
    }
}
