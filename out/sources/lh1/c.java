package lh1;

import c40.DocumentRowData;
import fr.t;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;
import s20.DocumentRefreshCardData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Llh1/c;", "", "a", "c", "b", "Llh1/c$a;", "Llh1/c$b;", "Llh1/c$c;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {

    /* JADX INFO: renamed from: lh1.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b\u0019\u0010%R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\u001d\u0010#¨\u0006&"}, d2 = {"Llh1/c$a;", "Llh1/c;", "", "Ls20/b;", "entries", "", "shouldPlayEnterAnimation", "Lkotlin/Function0;", "Loq/i0;", "onEnterAnimationPlayed", "Llh1/a;", "bigCardsState", "changeBigCardsState", "<init>", "(Ljava/util/List;ZLer/a;Llh1/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Z", "e", "()Z", "Ler/a;", "d", "()Ler/a;", "Llh1/a;", "()Llh1/a;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BIG implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<DocumentRefreshCardData> entries;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldPlayEnterAnimation;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onEnterAnimationPlayed;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final a bigCardsState;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> changeBigCardsState;

        public BIG(List<DocumentRefreshCardData> list, boolean z15, er.a<i0> aVar, a aVar2, er.a<i0> aVar3) {
            this.entries = list;
            this.shouldPlayEnterAnimation = z15;
            this.onEnterAnimationPlayed = aVar;
            this.bigCardsState = aVar2;
            this.changeBigCardsState = aVar3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getBigCardsState() {
            return this.bigCardsState;
        }

        public final er.a<i0> b() {
            return this.changeBigCardsState;
        }

        public final List<DocumentRefreshCardData> c() {
            return this.entries;
        }

        public final er.a<i0> d() {
            return this.onEnterAnimationPlayed;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getShouldPlayEnterAnimation() {
            return this.shouldPlayEnterAnimation;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BIG)) {
                return false;
            }
            BIG big = (BIG) other;
            return t.c(this.entries, big.entries) && this.shouldPlayEnterAnimation == big.shouldPlayEnterAnimation && t.c(this.onEnterAnimationPlayed, big.onEnterAnimationPlayed) && this.bigCardsState == big.bigCardsState && t.c(this.changeBigCardsState, big.changeBigCardsState);
        }

        public int hashCode() {
            return (((((((this.entries.hashCode() * 31) + Boolean.hashCode(this.shouldPlayEnterAnimation)) * 31) + this.onEnterAnimationPlayed.hashCode()) * 31) + this.bigCardsState.hashCode()) * 31) + this.changeBigCardsState.hashCode();
        }

        public String toString() {
            return "BIG(entries=" + this.entries + ", shouldPlayEnterAnimation=" + this.shouldPlayEnterAnimation + ", onEnterAnimationPlayed=" + this.onEnterAnimationPlayed + ", bigCardsState=" + this.bigCardsState + ", changeBigCardsState=" + this.changeBigCardsState + ')';
        }
    }

    /* JADX INFO: renamed from: lh1.c$b, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Llh1/c$b;", "Llh1/c;", "", "Lc40/a;", "entries", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LIST implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<DocumentRowData> entries;

        public LIST(List<DocumentRowData> list) {
            this.entries = list;
        }

        public final List<DocumentRowData> a() {
            return this.entries;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LIST) && t.c(this.entries, ((LIST) other).entries);
        }

        public int hashCode() {
            return this.entries.hashCode();
        }

        public String toString() {
            return "LIST(entries=" + this.entries + ')';
        }
    }

    /* JADX INFO: renamed from: lh1.c$c, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Llh1/c$c;", "Llh1/c;", "", "Ls20/b;", "entries", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SMALL implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<DocumentRefreshCardData> entries;

        public SMALL(List<DocumentRefreshCardData> list) {
            this.entries = list;
        }

        public final List<DocumentRefreshCardData> a() {
            return this.entries;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SMALL) && t.c(this.entries, ((SMALL) other).entries);
        }

        public int hashCode() {
            return this.entries.hashCode();
        }

        public String toString() {
            return "SMALL(entries=" + this.entries + ')';
        }
    }
}
