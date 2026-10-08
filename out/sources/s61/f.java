package s61;

import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import z30.FileBottomSheetItemData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ls61/e;", "Lmx/c;", "labelProvider", "Lkotlin/Function0;", "Loq/i0;", "onClicked", "Lz30/a;", "a", "(Ls61/e;Lmx/c;Ler/a;)Lz30/a;", "childpassportapplication_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f178263a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.TAKE_PHOTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.PICK_PHOTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.PICK_FILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f178263a = iArr;
        }
    }

    public static final FileBottomSheetItemData a(e eVar, mx.c cVar, er.a<i0> aVar) {
        int i15 = a.f178263a[eVar.ordinal()];
        if (i15 == 1) {
            return new FileBottomSheetItemData(jz.a.f106818m, cVar.c(w51.a.f210323e4), aVar);
        }
        if (i15 == 2) {
            return new FileBottomSheetItemData(jz.a.f106760e0, cVar.c(w51.a.f210295a4), aVar);
        }
        if (i15 == 3) {
            return new FileBottomSheetItemData(jz.a.f106760e0, cVar.c(w51.a.Y3), aVar);
        }
        throw new p();
    }
}
