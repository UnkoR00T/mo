package qj2;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import i50.BaseScaffoldData;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pj2.u;
import pj2.v;
import rj2.LegalInformationBottomSheetModel;
import rj2.LegalInformationScreenModel;
import x50.NavigationButtonData;
import x50.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lqj2/f;", "Lxw/f;", "Lqj2/f$a;", "Lpj2/v$a;", "Lmx/c;", "labelProvider", "Lu04/a;", "commonEndpoints", "<init>", "(Lmx/c;Lu04/a;)V", "params", "Lrj2/b;", "sheetState", "Lpj2/v$a$b;", "l", "(Lqj2/f$a;Lrj2/b;)Lpj2/v$a$b;", "Lmx/a;", "title", "Lkotlin/Function0;", "Loq/i0;", "onClickAction", "Ln50/g;", "v", "(Lmx/a;Ler/a;)Ln50/g;", "x", "(Lqj2/f$a;)Lpj2/v$a;", "a", "Lmx/c;", "b", "Lu04/a;", "legalinformation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<Params, v.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: qj2.f$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0017\u0010!R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b\u001b\u0010!R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, d2 = {"Lqj2/f$a;", "", "Lpj2/u;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "openUrl", "Lkotlin/Function0;", "onAppRegulationsClick", "onBackPressed", "onBottomSheetClosed", "<init>", "(Lpj2/u;Ler/l;Ler/a;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpj2/u;", "e", "()Lpj2/u;", "b", "Ler/l;", "d", "()Ler/l;", "c", "Ler/a;", "()Ler/a;", "legalinformation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final u state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> openUrl;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAppRegulationsClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackPressed;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBottomSheetClosed;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(u uVar, l<? super String, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = uVar;
            this.openUrl = lVar;
            this.onAppRegulationsClick = aVar;
            this.onBackPressed = aVar2;
            this.onBottomSheetClosed = aVar3;
        }

        public final er.a<i0> a() {
            return this.onAppRegulationsClick;
        }

        public final er.a<i0> b() {
            return this.onBackPressed;
        }

        public final er.a<i0> c() {
            return this.onBottomSheetClosed;
        }

        public final l<String, i0> d() {
            return this.openUrl;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final u getState() {
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
            return t.c(this.state, params.state) && t.c(this.openUrl, params.openUrl) && t.c(this.onAppRegulationsClick, params.onAppRegulationsClick) && t.c(this.onBackPressed, params.onBackPressed) && t.c(this.onBottomSheetClosed, params.onBottomSheetClosed);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.openUrl.hashCode()) * 31) + this.onAppRegulationsClick.hashCode()) * 31) + this.onBackPressed.hashCode()) * 31) + this.onBottomSheetClosed.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", openUrl=" + this.openUrl + ", onAppRegulationsClick=" + this.onAppRegulationsClick + ", onBackPressed=" + this.onBackPressed + ", onBottomSheetClosed=" + this.onBottomSheetClosed + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f167006a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1713772848);
            if (p076m2.t.k()) {
                p076m2.t.o(1713772848, i15, -1, "pl.gov.coi.mobywatel.feature.legalinformation.presentation.screens.mapper.LegalInformationMapper.createSingleCardData.<anonymous> (LegalInformationMapper.kt:116)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public f(mx.c cVar, u04.a aVar) {
        this.labelProvider = cVar;
        this.commonEndpoints = aVar;
    }

    private final v.a.Initialized l(final Params params, rj2.b sheetState) {
        er.a<i0> aVarB = params.b();
        String strT0 = this.commonEndpoints.t0();
        return new v.a.Initialized(new LegalInformationScreenModel(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(mj2.a.f126931h), null, null, null, 28, null), null, null, null, null, 61, null), strT0, pq.v.s(v(this.labelProvider.c(mj2.a.f126925b), new er.a() { // from class: qj2.b
            @Override // er.a
            public final Object a() {
                return f.q(params, this);
            }
        }), v(this.labelProvider.c(mj2.a.f126930g), new er.a() { // from class: qj2.c
            @Override // er.a
            public final Object a() {
                return f.r(params, this);
            }
        }), v(this.labelProvider.c(mj2.a.f126924a), new er.a() { // from class: qj2.d
            @Override // er.a
            public final Object a() {
                return f.s(params, this);
            }
        }), v(this.labelProvider.c(mj2.a.f126929f), new er.a() { // from class: qj2.e
            @Override // er.a
            public final Object a() {
                return f.u(params, this);
            }
        }), v(this.labelProvider.c(mj2.a.f126927d), params.a())), new LegalInformationBottomSheetModel(this.labelProvider.c(mj2.a.f126928e), null, this.labelProvider.c(mj2.a.f126926c), "file:///android_asset/regulacje_dot_mObywatel.html", new er.a() { // from class: qj2.a
            @Override // er.a
            public final Object a() {
                return f.m();
            }
        }, params.d()), sheetState, params.c()), aVarB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params, f fVar) {
        params.d().b(fVar.commonEndpoints.T());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params, f fVar) {
        params.d().b(fVar.commonEndpoints.p0());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params, f fVar) {
        params.d().b(fVar.commonEndpoints.o0());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Params params, f fVar) {
        params.d().b(fVar.commonEndpoints.t0());
        return i0.f148189a;
    }

    private final DefaultSingleCardData v(Label title, er.a<i0> onClickAction) {
        return new DefaultSingleCardData(null, onClickAction, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(title, null, null, 0, 0, null, 62, null)), null, 5, null), null, new x0.Icon(jz.a.V, null, b.f167006a, 2, null), null, 2813, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public v.a b(Params params) {
        u state = params.getState();
        if (state instanceof u.b) {
            return l(params, rj2.b.C4451b.f174628a);
        }
        if (state instanceof u.c) {
            return l(params, rj2.b.a.f174627a);
        }
        if (state instanceof u.Error) {
            return new v.a.Error(((u.Error) params.getState()).getVmsAdapter());
        }
        throw new oq.p();
    }
}
