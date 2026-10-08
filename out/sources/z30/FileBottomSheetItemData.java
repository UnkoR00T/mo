package z30;

import androidx.compose.ui.graphics.Color;
import d40.i;
import er.p;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: renamed from: z30.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\u001a\u0010!\u001a\u00020\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0014\u0010 ¨\u0006\""}, d2 = {"Lz30/a;", "", "", "iconResId", "Lmx/a;", "title", "Lkotlin/Function0;", "Loq/i0;", "onClick", "<init>", "(ILmx/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getIconResId", "b", "Lmx/a;", "c", "()Lmx/a;", "Ler/a;", "()Ler/a;", "Ld40/b$b;", "d", "Ld40/b$b;", "()Ld40/b$b;", "iconData", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FileBottomSheetItemData {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f232760e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int iconResId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> onClick;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d40.b.C0864b iconData;

    /* JADX INFO: renamed from: z30.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C6249a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C6249a f232765a = new C6249a();

        C6249a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1301473303);
            if (t.k()) {
                t.o(1301473303, i15, -1, "pl.gov.coi.common.ui.ds.custom.FileBottomSheetItemData.iconData.<anonymous> (FileBottomSheetItem.kt:38)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).a().b();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public FileBottomSheetItemData(int i15, Label label, er.a<i0> aVar) {
        this.iconResId = i15;
        this.title = label;
        this.onClick = aVar;
        this.iconData = new d40.b.C0864b(null, i15, i.f.f39709e, C6249a.f232765a, null, null, 33, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final d40.b.C0864b getIconData() {
        return this.iconData;
    }

    public final er.a<i0> b() {
        return this.onClick;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileBottomSheetItemData)) {
            return false;
        }
        FileBottomSheetItemData fileBottomSheetItemData = (FileBottomSheetItemData) other;
        return this.iconResId == fileBottomSheetItemData.iconResId && fr.t.c(this.title, fileBottomSheetItemData.title) && fr.t.c(this.onClick, fileBottomSheetItemData.onClick);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.iconResId) * 31) + this.title.hashCode()) * 31) + this.onClick.hashCode();
    }

    public String toString() {
        return "FileBottomSheetItemData(iconResId=" + this.iconResId + ", title=" + this.title + ", onClick=" + this.onClick + ')';
    }
}
