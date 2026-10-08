package p060i1;

import c1.e;
import c5.t;
import f3.c;
import fr.k;
import java.util.List;
import oq.g;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p036e4.a2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0015\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u00100\u001a\u0004\b,\u00101R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00102R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00103R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00104R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00106R\u0017\u0010:\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010'\u001a\u0004\b*\u0010)R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R$\u0010\u001a\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u00028\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b@\u0010'\u001a\u0004\bA\u0010)R\u0016\u0010C\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010'R\u0018\u0010E\u001a\u00020\u0002*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010D¨\u0006F"}, d2 = {"Li1/n;", "Li1/o;", "", "index", "size", "", "Le4/a2;", "placeables", "Lc5/n;", "visualOffset", "", "key", "Lz0/a2;", "orientation", "Lf3/c$b;", "horizontalAlignment", "Lf3/c$c;", "verticalAlignment", "Lc5/t;", "layoutDirection", "", "reverseLayout", "<init>", "(IILjava/util/List;JLjava/lang/Object;Lz0/a2;Lf3/c$b;Lf3/c$c;Lc5/t;ZLfr/k;)V", "e", "(I)J", "offset", "layoutWidth", "layoutHeight", "Loq/i0;", "h", "(III)V", "Le4/a2$a;", "scope", "g", "(Le4/a2$a;)V", "delta", "a", "(I)V", "I", "getIndex", "()I", "b", "f", "c", "Ljava/util/List;", "d", "J", "Ljava/lang/Object;", "()Ljava/lang/Object;", "Lf3/c$b;", "Lf3/c$c;", "Lc5/t;", "i", "Z", "j", "isVertical", "k", "crossAxisSize", "", "l", "[I", "placeableOffsets", "value", "m", "getOffset", "n", "mainAxisLayoutSize", "(Le4/a2;)I", "mainAxisSize", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<a2> placeables;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long visualOffset;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Object key;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final c.b horizontalAlignment;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final c.InterfaceC1317c verticalAlignment;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final t layoutDirection;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseLayout;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final int crossAxisSize;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final int[] placeableOffsets;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int offset;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int mainAxisLayoutSize;

    public /* synthetic */ n(int i15, int i16, List list, long j15, Object obj, p143z0.a2 a2Var, c.b bVar, c.InterfaceC1317c interfaceC1317c, t tVar, boolean z15, k kVar) {
        this(i15, i16, list, j15, obj, a2Var, bVar, interfaceC1317c, tVar, z15);
    }

    private final int d(a2 a2Var) {
        return this.isVertical ? a2Var.getHeight() : a2Var.getWidth();
    }

    private final long e(int index) {
        int[] iArr = this.placeableOffsets;
        int i15 = index * 2;
        return c5.n.d((((long) iArr[i15]) << 32) | (((long) iArr[i15 + 1]) & BodyPartID.bodyIdMax));
    }

    public final void a(int delta) {
        this.offset = getOffset() + delta;
        int length = this.placeableOffsets.length;
        for (int i15 = 0; i15 < length; i15++) {
            boolean z15 = this.isVertical;
            if ((z15 && i15 % 2 == 1) || (!z15 && i15 % 2 == 0)) {
                int[] iArr = this.placeableOffsets;
                iArr[i15] = iArr[i15] + delta;
            }
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public Object getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final void g(a2.a scope) {
        a2.a aVar;
        int i15;
        int iJ;
        int i16 = 0;
        if (!(this.mainAxisLayoutSize != Integer.MIN_VALUE)) {
            e.a("position() should be called first");
        }
        int size = this.placeables.size();
        while (i16 < size) {
            a2 a2Var = this.placeables.get(i16);
            long jE = e(i16);
            if (this.reverseLayout) {
                if (this.isVertical) {
                    i15 = c5.n.i(jE);
                } else {
                    i15 = (this.mainAxisLayoutSize - c5.n.i(jE)) - d(a2Var);
                }
                if (this.isVertical) {
                    iJ = (this.mainAxisLayoutSize - c5.n.j(jE)) - d(a2Var);
                } else {
                    iJ = c5.n.j(jE);
                }
                jE = c5.n.d((((long) i15) << 32) | (((long) iJ) & BodyPartID.bodyIdMax));
            }
            long jM = c5.n.m(jE, this.visualOffset);
            if (this.isVertical) {
                aVar = scope;
                a2.a.m0(aVar, a2Var, jM, 0.0f, null, 6, null);
            } else {
                aVar = scope;
                a2.a.W(aVar, a2Var, jM, 0.0f, null, 6, null);
            }
            i16++;
            scope = aVar;
        }
    }

    @Override // p060i1.o
    public int getIndex() {
        return this.index;
    }

    @Override // p060i1.o
    public int getOffset() {
        return this.offset;
    }

    public final void h(int offset, int layoutWidth, int layoutHeight) {
        int width;
        this.offset = offset;
        this.mainAxisLayoutSize = this.isVertical ? layoutHeight : layoutWidth;
        List<a2> list = this.placeables;
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            a2 a2Var = list.get(i15);
            int i16 = i15 * 2;
            if (this.isVertical) {
                int[] iArr = this.placeableOffsets;
                c.b bVar = this.horizontalAlignment;
                if (bVar == null) {
                    e.b("null horizontalAlignment");
                    throw new g();
                }
                iArr[i16] = bVar.a(a2Var.getWidth(), layoutWidth, this.layoutDirection);
                this.placeableOffsets[i16 + 1] = offset;
                width = a2Var.getHeight();
            } else {
                int[] iArr2 = this.placeableOffsets;
                iArr2[i16] = offset;
                int i17 = i16 + 1;
                c.InterfaceC1317c interfaceC1317c = this.verticalAlignment;
                if (interfaceC1317c == null) {
                    e.b("null verticalAlignment");
                    throw new g();
                }
                iArr2[i17] = interfaceC1317c.a(a2Var.getHeight(), layoutHeight);
                width = a2Var.getWidth();
            }
            offset += width;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private n(int i15, int i16, List<? extends a2> list, long j15, Object obj, p143z0.a2 a2Var, c.b bVar, c.InterfaceC1317c interfaceC1317c, t tVar, boolean z15) {
        this.index = i15;
        this.size = i16;
        this.placeables = list;
        this.visualOffset = j15;
        this.key = obj;
        this.horizontalAlignment = bVar;
        this.verticalAlignment = interfaceC1317c;
        this.layoutDirection = tVar;
        this.reverseLayout = z15;
        this.isVertical = a2Var == p143z0.a2.Vertical;
        int size = list.size();
        int iMax = 0;
        for (int i17 = 0; i17 < size; i17++) {
            a2 a2Var2 = (a2) list.get(i17);
            iMax = Math.max(iMax, !this.isVertical ? a2Var2.getHeight() : a2Var2.getWidth());
        }
        this.crossAxisSize = iMax;
        this.placeableOffsets = new int[this.placeables.size() * 2];
        this.mainAxisLayoutSize = PKIFailureInfo.systemUnavail;
    }
}
