package uu1;

import i50.BaseScaffoldData;
import mu.p0;
import oq.i0;
import p071kotlin.Metadata;
import w20.BaseDocumentScreenState;
import wu1.TextData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006¨\u0006\rÀ\u0006\u0003"}, d2 = {"Luu1/e;", "Ll00/e;", "Luu1/e$a;", "Lmu/p0;", "Lw20/a;", "L8", "()Lmu/p0;", "screenState", "Lg20/a;", "Lwu1/b;", "T", "bottomSheetState", "a", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends l00.e<Data> {
    p0<BaseDocumentScreenState> L8();

    p0<g20.a<TextData>> T();

    /* JADX INFO: renamed from: uu1.e$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Luu1/e$a;", "", "Li50/a;", "scaffoldData", "Lw20/f;", "documentState", "Lkotlin/Function0;", "Loq/i0;", "onBottomSheetClosed", "<init>", "(Li50/a;Lw20/f;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "d", "()Li50/a;", "b", "Lw20/f;", "c", "()Lw20/f;", "Ler/a;", "getOnBottomSheetClosed", "()Ler/a;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final w20.f documentState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBottomSheetClosed;

        public Data(BaseScaffoldData baseScaffoldData, w20.f fVar, er.a<i0> aVar) {
            this.scaffoldData = baseScaffoldData;
            this.documentState = fVar;
            this.onBottomSheetClosed = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 b() {
            return i0.f148189a;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final w20.f getDocumentState() {
            return this.documentState;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.scaffoldData, data.scaffoldData) && fr.t.c(this.documentState, data.documentState) && fr.t.c(this.onBottomSheetClosed, data.onBottomSheetClosed);
        }

        public int hashCode() {
            return (((this.scaffoldData.hashCode() * 31) + this.documentState.hashCode()) * 31) + this.onBottomSheetClosed.hashCode();
        }

        public String toString() {
            return "Data(scaffoldData=" + this.scaffoldData + ", documentState=" + this.documentState + ", onBottomSheetClosed=" + this.onBottomSheetClosed + ')';
        }

        public /* synthetic */ Data(BaseScaffoldData baseScaffoldData, w20.f fVar, er.a aVar, int i15, fr.k kVar) {
            this(baseScaffoldData, (i15 & 2) != 0 ? w20.f.b.f209373a : fVar, (i15 & 4) != 0 ? new er.a() { // from class: uu1.d
                @Override // er.a
                public final Object a() {
                    return e.Data.b();
                }
            } : aVar);
        }
    }
}
