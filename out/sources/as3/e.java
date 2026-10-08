package as3;

import cj0.ZusEVisitTerm;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Las3/e;", "", "a", "b", "Las3/e$a;", "Las3/e$b;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Las3/e$a;", "Las3/e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f14345a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return -440580640;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: as3.e$b, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000f¨\u0006\u001b"}, d2 = {"Las3/e$b;", "Las3/e;", "", "Lcj0/m;", "termsData", "", "selectedTermIndex", "<init>", "(Ljava/util/List;I)V", "a", "(Ljava/util/List;I)Las3/e$b;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "I", "c", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LoadedTerms implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ZusEVisitTerm> termsData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int selectedTermIndex;

        public LoadedTerms(List<ZusEVisitTerm> list, int i15) {
            this.termsData = list;
            this.selectedTermIndex = i15;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LoadedTerms b(LoadedTerms loadedTerms, List list, int i15, int i16, Object obj) {
            if ((i16 & 1) != 0) {
                list = loadedTerms.termsData;
            }
            if ((i16 & 2) != 0) {
                i15 = loadedTerms.selectedTermIndex;
            }
            return loadedTerms.a(list, i15);
        }

        public final LoadedTerms a(List<ZusEVisitTerm> termsData, int selectedTermIndex) {
            return new LoadedTerms(termsData, selectedTermIndex);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getSelectedTermIndex() {
            return this.selectedTermIndex;
        }

        public final List<ZusEVisitTerm> d() {
            return this.termsData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadedTerms)) {
                return false;
            }
            LoadedTerms loadedTerms = (LoadedTerms) other;
            return fr.t.c(this.termsData, loadedTerms.termsData) && this.selectedTermIndex == loadedTerms.selectedTermIndex;
        }

        public int hashCode() {
            return (this.termsData.hashCode() * 31) + Integer.hashCode(this.selectedTermIndex);
        }

        public String toString() {
            return "LoadedTerms(termsData=" + this.termsData + ", selectedTermIndex=" + this.selectedTermIndex + ')';
        }
    }
}
