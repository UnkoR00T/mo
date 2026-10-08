package l42;

import java.util.List;
import p071kotlin.Metadata;
import vr0.BEUserCard;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Ll42/c;", "", "a", "b", "Ll42/c$a;", "Ll42/c$b;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ll42/c$a;", "Ll42/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f115884a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return -55503833;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: l42.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJF\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#¨\u0006$"}, d2 = {"Ll42/c$b;", "Ll42/c;", "Lm42/b;", "source", "", "Lvr0/p;", "sourceCards", "currentCards", "Lcb4/i;", "dialog", "<init>", "(Lm42/b;Ljava/util/List;Ljava/util/List;Lcb4/i;)V", "a", "(Lm42/b;Ljava/util/List;Ljava/util/List;Lcb4/i;)Ll42/c$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lm42/b;", "e", "()Lm42/b;", "b", "Ljava/util/List;", "f", "()Ljava/util/List;", "c", "d", "Lcb4/i;", "()Lcb4/i;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final m42.b source;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<BEUserCard> sourceCards;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<BEUserCard> currentCards;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final cb4.i dialog;

        public Initialized(m42.b bVar, List<BEUserCard> list, List<BEUserCard> list2, cb4.i iVar) {
            this.source = bVar;
            this.sourceCards = list;
            this.currentCards = list2;
            this.dialog = iVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Initialized b(Initialized initialized, m42.b bVar, List list, List list2, cb4.i iVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                bVar = initialized.source;
            }
            if ((i15 & 2) != 0) {
                list = initialized.sourceCards;
            }
            if ((i15 & 4) != 0) {
                list2 = initialized.currentCards;
            }
            if ((i15 & 8) != 0) {
                iVar = initialized.dialog;
            }
            return initialized.a(bVar, list, list2, iVar);
        }

        public final Initialized a(m42.b source, List<BEUserCard> sourceCards, List<BEUserCard> currentCards, cb4.i dialog) {
            return new Initialized(source, sourceCards, currentCards, dialog);
        }

        public final List<BEUserCard> c() {
            return this.currentCards;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final cb4.i getDialog() {
            return this.dialog;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final m42.b getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.source, initialized.source) && fr.t.c(this.sourceCards, initialized.sourceCards) && fr.t.c(this.currentCards, initialized.currentCards) && fr.t.c(this.dialog, initialized.dialog);
        }

        public final List<BEUserCard> f() {
            return this.sourceCards;
        }

        public int hashCode() {
            int iHashCode = ((((this.source.hashCode() * 31) + this.sourceCards.hashCode()) * 31) + this.currentCards.hashCode()) * 31;
            cb4.i iVar = this.dialog;
            return iHashCode + (iVar == null ? 0 : iVar.hashCode());
        }

        public String toString() {
            return "Initialized(source=" + this.source + ", sourceCards=" + this.sourceCards + ", currentCards=" + this.currentCards + ", dialog=" + this.dialog + ')';
        }

        public /* synthetic */ Initialized(m42.b bVar, List list, List list2, cb4.i iVar, int i15, fr.k kVar) {
            this(bVar, list, list2, (i15 & 8) != 0 ? null : iVar);
        }
    }
}
