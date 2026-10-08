package androidx.compose.ui.graphics;

import android.graphics.Shader;
import fr.t;
import java.util.ArrayList;
import java.util.List;
import n3.f2;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BC\b\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0013\u001a\u00060\u0011j\u0002`\u00122\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010!\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\"R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\n\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u001a\u0010\f\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u001c¨\u00062"}, d2 = {"Landroidx/compose/ui/graphics/g;", "Landroidx/compose/ui/graphics/h;", "Ln3/f2;", "", "Landroidx/compose/ui/graphics/Color;", "colors", "", "stops", "Lm3/e;", "start", "end", "Landroidx/compose/ui/graphics/k;", "tileMode", "<init>", "(Ljava/util/List;Ljava/util/List;JJILfr/k;)V", "Lm3/k;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "c", "(J)Landroid/graphics/Shader;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "t", "b", "(Ljava/lang/Object;F)Ljava/lang/Object;", "g", "Ljava/util/List;", "getColors$ui_graphics", "()Ljava/util/List;", "h", "getStops$ui_graphics", "i", "J", "getStart-F1C5BW0$ui_graphics", "()J", "j", "getEnd-F1C5BW0$ui_graphics", "k", "I", "getTileMode-3opZhB0$ui_graphics", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g extends h implements f2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<Color> colors;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<Float> stops;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long start;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long end;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final int tileMode;

    public /* synthetic */ g(List list, List list2, long j15, long j16, int i15, fr.k kVar) {
        this(list, list2, j15, j16, i15);
    }

    @Override // n3.f2
    public Object b(Object other, float t15) {
        fr.k kVar = null;
        if (other == null) {
            other = new SolidColor(Color.INSTANCE.g(), kVar);
        }
        if (other instanceof SolidColor) {
            List<Color> list = this.colors;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                list.get(i15).m20unboximpl();
                arrayList.add(Color.m0boximpl(((SolidColor) other).getValue()));
            }
            other = new g(arrayList, this.stops, this.start, this.end, this.tileMode, null);
        }
        if (!(other instanceof g)) {
            return null;
        }
        g gVar = (g) other;
        return new g(d.b(this.colors, gVar.colors, t15), d.d(this.stops, gVar.stops, t15), d.e(this.start, gVar.start, t15), d.e(this.end, gVar.end, t15), t15 < 0.5f ? this.tileMode : gVar.tileMode, null);
    }

    @Override // androidx.compose.ui.graphics.h
    public Shader c(long size) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.start >> 32)) == Float.POSITIVE_INFINITY ? size >> 32 : this.start >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.start & BodyPartID.bodyIdMax)) == Float.POSITIVE_INFINITY ? size & BodyPartID.bodyIdMax : this.start & BodyPartID.bodyIdMax));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.end >> 32)) == Float.POSITIVE_INFINITY ? size >> 32 : this.end >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.end & BodyPartID.bodyIdMax)) == Float.POSITIVE_INFINITY ? size & BodyPartID.bodyIdMax : this.end & BodyPartID.bodyIdMax));
        List<Color> list = this.colors;
        List<Float> list2 = this.stops;
        return i.d(m3.e.e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & BodyPartID.bodyIdMax)), m3.e.e((((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32)), list, list2, this.tileMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof g)) {
            return false;
        }
        g gVar = (g) other;
        return t.c(this.colors, gVar.colors) && t.c(this.stops, gVar.stops) && m3.e.j(this.start, gVar.start) && m3.e.j(this.end, gVar.end) && k.f(this.tileMode, gVar.tileMode);
    }

    public int hashCode() {
        int iHashCode = this.colors.hashCode() * 31;
        List<Float> list = this.stops;
        return ((((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + m3.e.o(this.start)) * 31) + m3.e.o(this.end)) * 31) + k.g(this.tileMode);
    }

    public String toString() {
        String str;
        String str2 = "";
        if (((((this.start & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) m3.e.s(this.start)) + ", ";
        } else {
            str = "";
        }
        if ((((9187343241974906880L ^ (this.end & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) m3.e.s(this.end)) + ", ";
        }
        return "LinearGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str + str2 + "tileMode=" + ((Object) k.h(this.tileMode)) + ')';
    }

    private g(List<Color> list, List<Float> list2, long j15, long j16, int i15) {
        this.colors = list;
        this.stops = list2;
        this.start = j15;
        this.end = j16;
        this.tileMode = i15;
    }
}
