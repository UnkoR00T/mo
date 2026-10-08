package k01;

import androidx.compose.ui.graphics.Color;
import er.p;
import fr.t;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import mx.c;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.i;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lk01/a;", "Lxw/f;", "Lk01/a$a;", "Lj01/f$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "", "Ln50/g;", "e", "(Lk01/a$a;)Ljava/util/List;", "Lmx/a;", "titleLabel", "descriptionLabel", "Lkotlin/Function0;", "Loq/i0;", "onClick", "", "iconResId", "c", "(Lmx/a;Lmx/a;Ler/a;I)Ln50/g;", "f", "(Lk01/a$a;)Lj01/f$a;", "a", "Lmx/c;", "apprating_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, j01.f.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: k01.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Lk01/a$a;", "", "Lkotlin/Function0;", "Loq/i0;", "backAction", "rateAction", "reportAction", "<init>", "(Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "b", "c", "apprating_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> rateAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> reportAction;

        public Params(er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.backAction = aVar;
            this.rateAction = aVar2;
            this.reportAction = aVar3;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final er.a<i0> b() {
            return this.rateAction;
        }

        public final er.a<i0> c() {
            return this.reportAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.backAction, params.backAction) && t.c(this.rateAction, params.rateAction) && t.c(this.reportAction, params.reportAction);
        }

        public int hashCode() {
            return (((this.backAction.hashCode() * 31) + this.rateAction.hashCode()) * 31) + this.reportAction.hashCode();
        }

        public String toString() {
            return "Params(backAction=" + this.backAction + ", rateAction=" + this.rateAction + ", reportAction=" + this.reportAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f107193a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(333315714);
            if (p076m2.t.k()) {
                p076m2.t.o(333315714, i15, -1, "pl.gov.coi.mobywatel.feature.apprating.presentation.rate.mapper.AppRatingMapper.createSingleCardData.<anonymous> (AppRatingMapper.kt:68)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    private final DefaultSingleCardData c(Label titleLabel, Label descriptionLabel, er.a<i0> onClick, int iconResId) {
        return new DefaultSingleCardData(null, onClick, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(titleLabel, null, null, 0, 0, null, 62, null)), new SingleCardLabel(descriptionLabel, null, null, 0, 0, null, 62, null), 1, null), new LeadingSection(false, null, new i.Icon(iconResId, null, b.f107193a, null, null, 26, null), 3, null), x0.Icon.INSTANCE.b(), null, 2301, null);
    }

    private final List<DefaultSingleCardData> e(Params params) {
        return v.q(c(this.labelProvider.c(d01.a.f38963l), this.labelProvider.c(d01.a.f38962k), params.b(), jz.a.f106761e1), c(this.labelProvider.c(d01.a.f38965n), this.labelProvider.c(d01.a.f38964m), params.c(), jz.a.U0));
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public j01.f.Data b(Params params) {
        return new j01.f.Data(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(d01.a.f38966o), null, null, null, 28, null), null, null, null, null, 61, null), e(params));
    }
}
