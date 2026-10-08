package rr1;

import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import k30.c;
import mx.b;
import oq.i0;
import p071kotlin.Metadata;
import qr1.d;
import qr1.e;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lrr1/a;", "Lxw/f;", "Lrr1/a$a;", "Lqr1/e$a;", "<init>", "()V", "params", "c", "(Lrr1/a$a;)Lqr1/e$a;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, e.Data> {

    /* JADX INFO: renamed from: rr1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u0015\u0010\u001b¨\u0006\u001f"}, d2 = {"Lrr1/a$a;", "", "Lqr1/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "onCheckGPS", "onRequestGPS", "onBack", "<init>", "(Lqr1/d;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqr1/d;", "getState", "()Lqr1/d;", "b", "Ler/a;", "()Ler/a;", "c", "getOnRequestGPS", "d", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCheckGPS;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onRequestGPS;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        public Params(d dVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = dVar;
            this.onCheckGPS = aVar;
            this.onRequestGPS = aVar2;
            this.onBack = aVar3;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onCheckGPS;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onCheckGPS, params.onCheckGPS) && t.c(this.onRequestGPS, params.onRequestGPS) && t.c(this.onBack, params.onBack);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onCheckGPS.hashCode()) * 31) + this.onRequestGPS.hashCode()) * 31) + this.onBack.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onCheckGPS=" + this.onCheckGPS + ", onRequestGPS=" + this.onRequestGPS + ", onBack=" + this.onBack + ')';
        }
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public e.Data b(Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), b.b("Permissions", "ScreenTitle"), null, null, null, 28, null), null, null, null, null, 61, null);
        k30.a.Large large = new k30.a.Large(false, 1, null);
        k30.d.a aVar = k30.d.a.f107773a;
        return new e.Data(baseScaffoldData, new ButtonData(null, null, large, new c.WithText(b.b("Check GPS permission", ""), null, 2, null), aVar, null, params.b(), 35, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new c.WithText(b.b("Request GPS permission", ""), null, 2, null), aVar, null, params.b(), 35, null), params.a());
    }
}
