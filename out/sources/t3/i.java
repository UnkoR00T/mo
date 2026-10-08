package t3;

import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.eac.EACTags;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\u001a;\u0010\n\u001a\u00020\t*\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\r\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u000f\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"", "Ljava/util/ArrayList;", "Lt3/h;", "Lkotlin/collections/ArrayList;", "nodes", "", "args", "", "count", "Loq/i0;", "a", "(CLjava/util/ArrayList;[FI)V", "", "b", "(Ljava/util/List;[FI)V", "c", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i {
    public static final void a(char c15, ArrayList<h> arrayList, float[] fArr, int i15) {
        int i16 = 0;
        switch (c15) {
            case 'A':
                int i17 = i15 - 7;
                for (int i18 = 0; i18 <= i17; i18 += 7) {
                    arrayList.add(new h.ArcTo(fArr[i18], fArr[i18 + 1], fArr[i18 + 2], Float.compare(fArr[i18 + 3], 0.0f) != 0, Float.compare(fArr[i18 + 4], 0.0f) != 0, fArr[i18 + 5], fArr[i18 + 6]));
                }
                return;
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                int i19 = i15 - 6;
                while (i16 <= i19) {
                    arrayList.add(new h.CurveTo(fArr[i16], fArr[i16 + 1], fArr[i16 + 2], fArr[i16 + 3], fArr[i16 + 4], fArr[i16 + 5]));
                    i16 += 6;
                }
                return;
            case 'H':
                int i25 = i15 - 1;
                while (i16 <= i25) {
                    arrayList.add(new h.HorizontalTo(fArr[i16]));
                    i16++;
                }
                return;
            case 'L':
                int i26 = i15 - 2;
                while (i16 <= i26) {
                    arrayList.add(new h.LineTo(fArr[i16], fArr[i16 + 1]));
                    i16 += 2;
                }
                return;
            case EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID /* 77 */:
                b(arrayList, fArr, i15);
                return;
            case EACTags.ANSWER_TO_RESET /* 81 */:
                int i27 = i15 - 4;
                while (i16 <= i27) {
                    arrayList.add(new h.QuadTo(fArr[i16], fArr[i16 + 1], fArr[i16 + 2], fArr[i16 + 3]));
                    i16 += 4;
                }
                return;
            case 'S':
                int i28 = i15 - 4;
                while (i16 <= i28) {
                    arrayList.add(new h.ReflectiveCurveTo(fArr[i16], fArr[i16 + 1], fArr[i16 + 2], fArr[i16 + 3]));
                    i16 += 4;
                }
                return;
            case 'T':
                int i29 = i15 - 2;
                while (i16 <= i29) {
                    arrayList.add(new h.ReflectiveQuadTo(fArr[i16], fArr[i16 + 1]));
                    i16 += 2;
                }
                return;
            case 'V':
                int i35 = i15 - 1;
                while (i16 <= i35) {
                    arrayList.add(new h.VerticalTo(fArr[i16]));
                    i16++;
                }
                return;
            case 'Z':
            case 'z':
                arrayList.add(h.b.f187299c);
                return;
            case 'a':
                int i36 = i15 - 7;
                for (int i37 = 0; i37 <= i36; i37 += 7) {
                    arrayList.add(new h.RelativeArcTo(fArr[i37], fArr[i37 + 1], fArr[i37 + 2], Float.compare(fArr[i37 + 3], 0.0f) != 0, Float.compare(fArr[i37 + 4], 0.0f) != 0, fArr[i37 + 5], fArr[i37 + 6]));
                }
                return;
            case 'c':
                int i38 = i15 - 6;
                while (i16 <= i38) {
                    arrayList.add(new h.RelativeCurveTo(fArr[i16], fArr[i16 + 1], fArr[i16 + 2], fArr[i16 + 3], fArr[i16 + 4], fArr[i16 + 5]));
                    i16 += 6;
                }
                return;
            case 'h':
                int i39 = i15 - 1;
                while (i16 <= i39) {
                    arrayList.add(new h.RelativeHorizontalTo(fArr[i16]));
                    i16++;
                }
                return;
            case 'l':
                int i45 = i15 - 2;
                while (i16 <= i45) {
                    arrayList.add(new h.RelativeLineTo(fArr[i16], fArr[i16 + 1]));
                    i16 += 2;
                }
                return;
            case 'm':
                c(arrayList, fArr, i15);
                return;
            case 'q':
                int i46 = i15 - 4;
                while (i16 <= i46) {
                    arrayList.add(new h.RelativeQuadTo(fArr[i16], fArr[i16 + 1], fArr[i16 + 2], fArr[i16 + 3]));
                    i16 += 4;
                }
                return;
            case 's':
                int i47 = i15 - 4;
                while (i16 <= i47) {
                    arrayList.add(new h.RelativeReflectiveCurveTo(fArr[i16], fArr[i16 + 1], fArr[i16 + 2], fArr[i16 + 3]));
                    i16 += 4;
                }
                return;
            case 't':
                int i48 = i15 - 2;
                while (i16 <= i48) {
                    arrayList.add(new h.RelativeReflectiveQuadTo(fArr[i16], fArr[i16 + 1]));
                    i16 += 2;
                }
                return;
            case 'v':
                int i49 = i15 - 1;
                while (i16 <= i49) {
                    arrayList.add(new h.RelativeVerticalTo(fArr[i16]));
                    i16++;
                }
                return;
            default:
                throw new IllegalArgumentException("Unknown command for: " + c15);
        }
    }

    private static final void b(List<h> list, float[] fArr, int i15) {
        int i16 = i15 - 2;
        if (i16 >= 0) {
            list.add(new h.MoveTo(fArr[0], fArr[1]));
            for (int i17 = 2; i17 <= i16; i17 += 2) {
                list.add(new h.LineTo(fArr[i17], fArr[i17 + 1]));
            }
        }
    }

    private static final void c(List<h> list, float[] fArr, int i15) {
        int i16 = i15 - 2;
        if (i16 >= 0) {
            list.add(new h.RelativeMoveTo(fArr[0], fArr[1]));
            for (int i17 = 2; i17 <= i16; i17 += 2) {
                list.add(new h.RelativeLineTo(fArr[i17], fArr[i17 + 1]));
            }
        }
    }
}
