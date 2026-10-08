package c11;

import androidx.compose.ui.graphics.Color;
import er.p;
import fr.t;
import i40.DialogIconData;
import j30.ButtonTextData;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import vw.NavigationDialogModel;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lc11/d;", "Lxw/f;", "Lc11/d$a;", "Lvw/a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "h", "(Lc11/d$a;)Lvw/a;", "a", "Lmx/c;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements xw.f<Params, NavigationDialogModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c11.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lc11/d$a;", "", "Lkotlin/Function0;", "Loq/i0;", "onReject", "<init>", "(Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onReject;

        public Params(er.a<i0> aVar) {
            this.onReject = aVar;
        }

        public final er.a<i0> a() {
            return this.onReject;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.onReject, ((Params) other).onReject);
        }

        public int hashCode() {
            return this.onReject.hashCode();
        }

        public String toString() {
            return "Params(onReject=" + this.onReject + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f22556a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(288423061);
            if (p076m2.t.k()) {
                p076m2.t.o(288423061, i15, -1, "pl.gov.coi.mobywatel.feature.authconfirmation.presentation.confirmation.mapper.AuthConfirmationDialogMapper.invoke.<anonymous> (AuthConfirmationDialogMapper.kt:25)");
            }
            long jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jG;
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params) {
        params.a().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m() {
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public NavigationDialogModel b(final Params params) {
        return new NavigationDialogModel(this.labelProvider.c(do2.a.f43588j), this.labelProvider.c(do2.a.f43587i), null, new DialogIconData(jz.a.F, b.f22556a), null, new er.a() { // from class: c11.c
            @Override // er.a
            public final Object a() {
                return d.m();
            }
        }, new ButtonTextData(null, this.labelProvider.c(do2.a.f43582d), k30.b.a.f107766a, null, new er.a() { // from class: c11.a
            @Override // er.a
            public final Object a() {
                return d.i(params);
            }
        }, 9, null), new ButtonTextData(null, this.labelProvider.c(do2.a.f43583e), k30.b.c.f107768a, null, new er.a() { // from class: c11.b
            @Override // er.a
            public final Object a() {
                return d.l();
            }
        }, 9, null), 20, null);
    }
}
