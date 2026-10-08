package tk2;

import androidx.compose.ui.graphics.Color;
import er.p;
import fr.t;
import i50.BaseScaffoldData;
import mx.c;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import sk2.h;
import t40.InfoRowListData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ltk2/a;", "Lxw/f;", "Ltk2/a$a;", "Lsk2/h$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "stringId", "Lt40/a$a;", "c", "(I)Lt40/a$a;", "params", "e", "(Ltk2/a$a;)Lsk2/h$a;", "a", "Lmx/c;", "midcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, h.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: tk2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ltk2/a$a;", "", "Lkotlin/Function0;", "Loq/i0;", "onBackPressed", "<init>", "(Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "midcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackPressed;

        public Params(er.a<i0> aVar) {
            this.onBackPressed = aVar;
        }

        public final er.a<i0> a() {
            return this.onBackPressed;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.onBackPressed, ((Params) other).onBackPressed);
        }

        public int hashCode() {
            return this.onBackPressed.hashCode();
        }

        public String toString() {
            return "Params(onBackPressed=" + this.onBackPressed + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f190605a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1381522641);
            if (p076m2.t.k()) {
                p076m2.t.o(-1381522641, i15, -1, "pl.gov.coi.mobywatel.feature.midcard.presentation.screen.info.mapper.MobileIdCardInfoScreenMapper.invoke.<anonymous> (MobileIdCardInfoScreenMapper.kt:36)");
            }
            long jA = ((nk2.a) rVar.N(nk2.c.c())).a();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jA;
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    private final t40.a.C4874a c(int stringId) {
        return new t40.a.C4874a(this.labelProvider.c(stringId));
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public h.Data b(Params params) {
        return new h.Data(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), null, null, null, null, 30, null), null, null, null, null, 61, null), new o40.a.Icon(jz.a.K2, null, b.f190605a, this.labelProvider.c(ik2.a.f93200i0), this.labelProvider.c(ik2.a.f93196g0), null, 34, null), new InfoRowListData(v.g(c(ik2.a.f93190d0), c(ik2.a.f93194f0), c(ik2.a.f93198h0), c(ik2.a.f93192e0))), params.a());
    }
}
