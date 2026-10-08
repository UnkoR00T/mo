package gl2;

import fr.t;
import i50.BaseScaffoldData;
import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lgl2/c;", "Ll00/e;", "Lgl2/c$a;", "a", "myikp_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0007\nB\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lgl2/c$a;", "", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "<init>", "(Ler/a;)V", "a", "Ler/a;", "()Ler/a;", "b", "Lgl2/c$a$a;", "Lgl2/c$a$b;", "myikp_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: gl2.c$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lgl2/c$a$a;", "Lgl2/c$a;", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "<init>", "(Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ler/a;", "a", "()Ler/a;", "myikp_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initial extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackClick;

            public Initial(er.a<i0> aVar) {
                super(aVar, null);
                this.onBackClick = aVar;
            }

            @Override // gl2.c.a
            public er.a<i0> a() {
                return this.onBackClick;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Initial) && t.c(this.onBackClick, ((Initial) other).onBackClick);
            }

            public int hashCode() {
                return this.onBackClick.hashCode();
            }

            public String toString() {
                return "Initial(onBackClick=" + this.onBackClick + ')';
            }
        }

        /* JADX INFO: renamed from: gl2.c$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001a\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b!\u0010%R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lgl2/c$a$b;", "Lgl2/c$a;", "Li50/a;", "baseScaffoldData", "Lo40/a;", "headerData", "Lc30/b;", "alertData", "Ln30/b;", "cardListData", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "<init>", "(Li50/a;Lo40/a;Lc30/b;Ln30/b;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Li50/a;", "c", "()Li50/a;", "Lo40/a;", "e", "()Lo40/a;", "d", "Lc30/b;", "()Lc30/b;", "Ln30/b;", "()Ln30/b;", "f", "Ler/a;", "a", "()Ler/a;", "myikp_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final o40.a headerData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final c30.b alertData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData cardListData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackClick;

            public Initialized(BaseScaffoldData baseScaffoldData, o40.a aVar, c30.b bVar, CardListData cardListData, er.a<i0> aVar2) {
                super(aVar2, null);
                this.baseScaffoldData = baseScaffoldData;
                this.headerData = aVar;
                this.alertData = bVar;
                this.cardListData = cardListData;
                this.onBackClick = aVar2;
            }

            @Override // gl2.c.a
            public er.a<i0> a() {
                return this.onBackClick;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final c30.b getAlertData() {
                return this.alertData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final CardListData getCardListData() {
                return this.cardListData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final o40.a getHeaderData() {
                return this.headerData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return t.c(this.baseScaffoldData, initialized.baseScaffoldData) && t.c(this.headerData, initialized.headerData) && t.c(this.alertData, initialized.alertData) && t.c(this.cardListData, initialized.cardListData) && t.c(this.onBackClick, initialized.onBackClick);
            }

            public int hashCode() {
                int iHashCode = ((this.baseScaffoldData.hashCode() * 31) + this.headerData.hashCode()) * 31;
                c30.b bVar = this.alertData;
                return ((((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.cardListData.hashCode()) * 31) + this.onBackClick.hashCode();
            }

            public String toString() {
                return "Initialized(baseScaffoldData=" + this.baseScaffoldData + ", headerData=" + this.headerData + ", alertData=" + this.alertData + ", cardListData=" + this.cardListData + ", onBackClick=" + this.onBackClick + ')';
            }
        }

        public /* synthetic */ a(er.a aVar, fr.k kVar) {
            this(aVar);
        }

        public er.a<i0> a() {
            return this.onBackClick;
        }

        private a(er.a<i0> aVar) {
            this.onBackClick = aVar;
        }
    }
}
