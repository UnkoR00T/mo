package q50;

import androidx.compose.ui.graphics.Color;
import er.p;
import fr.k;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lq50/i;", "", "a", "b", "Lq50/i$a;", "Lq50/i$b;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i {

    /* JADX INFO: renamed from: q50.i$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lq50/i$a;", "Lq50/i;", "Lkotlin/Function0;", "Landroidx/compose/ui/graphics/Color;", "iconColor", "<init>", "(Ler/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/p;", "()Ler/p;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DefaultContainer implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<r, Integer, Color> iconColor;

        /* JADX INFO: renamed from: q50.i$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C4093a implements p<r, Integer, Color> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C4093a f164797a = new C4093a();

            C4093a() {
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
                return Color.m0boximpl(c(rVar, num.intValue()));
            }

            public final long c(r rVar, int i15) {
                rVar.X(474739215);
                if (t.k()) {
                    t.o(474739215, i15, -1, "pl.gov.coi.common.ui.ds.statisticcard.StatisticCardVariant.DefaultContainer.<init>.<anonymous> (StatisticCardData.kt:21)");
                }
                long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
                if (t.k()) {
                    t.n();
                }
                rVar.R();
                return jB;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DefaultContainer() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final p<r, Integer, Color> a() {
            return this.iconColor;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DefaultContainer) && fr.t.c(this.iconColor, ((DefaultContainer) other).iconColor);
        }

        public int hashCode() {
            return this.iconColor.hashCode();
        }

        public String toString() {
            return "DefaultContainer(iconColor=" + this.iconColor + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DefaultContainer(p<? super r, ? super Integer, Color> pVar) {
            this.iconColor = pVar;
        }

        public /* synthetic */ DefaultContainer(p pVar, int i15, k kVar) {
            this((i15 & 1) != 0 ? C4093a.f164797a : pVar);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lq50/i$b;", "Lq50/i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f164798a = new b();

        private b() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return 1871103177;
        }

        public String toString() {
            return "FilledContainer";
        }
    }
}
