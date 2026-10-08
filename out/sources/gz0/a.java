package gz0;

import androidx.compose.ui.graphics.Color;
import er.p;
import fr.t;
import fz0.d;
import h30.ButtonData;
import mx.Label;
import mx.c;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lgz0/a;", "Lxw/f;", "Lgz0/a$a;", "Lfz0/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lgz0/a$a;)Lfz0/d$a;", "a", "Lmx/c;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, d.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: gz0.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lgz0/a$a;", "", "Lfz0/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onGoToDashboard", "<init>", "(Lfz0/c;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfz0/c;", "getState", "()Lfz0/c;", "b", "Ler/a;", "()Ler/a;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final fz0.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoToDashboard;

        public Params(fz0.c cVar, er.a<i0> aVar) {
            this.state = cVar;
            this.onGoToDashboard = aVar;
        }

        public final er.a<i0> a() {
            return this.onGoToDashboard;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onGoToDashboard, params.onGoToDashboard);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.onGoToDashboard.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onGoToDashboard=" + this.onGoToDashboard + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f78546a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-2024763603);
            if (p076m2.t.k()) {
                p076m2.t.o(-2024763603, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.savepointsuccess.mapper.SavePointSuccessScreenMapper.invoke.<anonymous> (SavePointSuccessScreenMapper.kt:29)");
            }
            long jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().d();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jD;
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d.Data b(Params params) {
        int i15 = jz.a.f106738b2;
        Label labelC = this.labelProvider.c(zx0.b.f238272y);
        Label labelC2 = this.labelProvider.c(zx0.b.f238273z);
        Label.Companion companion = Label.INSTANCE;
        Label labelC3 = companion.c();
        Label labelC4 = companion.c();
        Label labelC5 = companion.c();
        Label labelC6 = companion.c();
        er.a<i0> aVarA = params.a();
        return new d.Data(new h50.a(i15, b.f78546a, labelC, labelC2, labelC3, labelC4, labelC5, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(zx0.b.R), null, 2, null), k30.d.a.f107773a, null, params.a(), 35, null), null, null, labelC6, aVarA));
    }
}
