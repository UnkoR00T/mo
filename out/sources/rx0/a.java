package rx0;

import androidx.compose.ui.graphics.Color;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import k30.d;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import qx0.m;
import t40.InfoRowListData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lrx0/a;", "Lxw/f;", "Lrx0/a$a;", "Lqx0/m$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "stringId", "Lt40/a$a;", "c", "(I)Lt40/a$a;", "params", "e", "(Lrx0/a$a;)Lqx0/m$a;", "a", "Lmx/c;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, m.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: rx0.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lrx0/a$a;", "", "Lkotlin/Function0;", "Loq/i0;", "onBackPressed", "onNextButtonClicked", "<init>", "(Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "b", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackPressed;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextButtonClicked;

        public Params(er.a<i0> aVar, er.a<i0> aVar2) {
            this.onBackPressed = aVar;
            this.onNextButtonClicked = aVar2;
        }

        public final er.a<i0> a() {
            return this.onBackPressed;
        }

        public final er.a<i0> b() {
            return this.onNextButtonClicked;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.onBackPressed, params.onBackPressed) && t.c(this.onNextButtonClicked, params.onNextButtonClicked);
        }

        public int hashCode() {
            return (this.onBackPressed.hashCode() * 31) + this.onNextButtonClicked.hashCode();
        }

        public String toString() {
            return "Params(onBackPressed=" + this.onBackPressed + ", onNextButtonClicked=" + this.onNextButtonClicked + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f176613a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1505971851);
            if (p076m2.t.k()) {
                p076m2.t.o(1505971851, i15, -1, "pl.gov.coi.mobywatel.feature.adddocument.presentation.screen.regulations.mapper.DocumentRegulationsScreenMapper.invoke.<anonymous> (DocumentRegulationsScreenMapper.kt:43)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f176614a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-669944470);
            if (p076m2.t.k()) {
                p076m2.t.o(-669944470, i15, -1, "pl.gov.coi.mobywatel.feature.adddocument.presentation.screen.regulations.mapper.DocumentRegulationsScreenMapper.invoke.<anonymous> (DocumentRegulationsScreenMapper.kt:44)");
            }
            long secondary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getSecondary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return secondary;
        }
    }

    public a(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final t40.a.C4874a c(int stringId) {
        return new t40.a.C4874a(this.labelProvider.c(stringId));
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public m.Data b(Params params) {
        return new m.Data(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), null, null, null, null, 30, null), null, null, this.labelProvider.c(yw0.a.f229997z), null, 45, null), new o40.a.Icon(jz.a.L0, b.f176613a, c.f176614a, this.labelProvider.c(yw0.a.f229997z), this.labelProvider.c(yw0.a.f229990s), null, 32, null), new InfoRowListData(v.g(c(yw0.a.f229987p), c(yw0.a.f229989r), c(yw0.a.f229991t), c(yw0.a.f229988q))), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(yw0.a.P), null, 2, null), d.a.f107773a, null, params.b(), 35, null), params.a());
    }
}
