package androidx.compose.ui.node;

import g4.u1;
import java.util.Arrays;
import p036e4.i2;
import p071kotlin.Metadata;
import r0.i1;
import r0.t0;
import r0.u0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J?\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122 \u0010\u0018\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015\u0018\u00010\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u0003R\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001dR\u001e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010 R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010#R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010&R\"\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010(R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010(¨\u0006,"}, d2 = {"Landroidx/compose/ui/node/r;", "", "<init>", "()V", "Le4/i2;", "ruler", "", "defaultValue", "c", "(Le4/i2;F)F", "value", "Loq/i0;", "e", "(Le4/i2;F)V", "", "b", "(Le4/i2;)Z", "isLookingAhead", "Landroidx/compose/ui/node/j;", "node", "Lr0/t0;", "Lr0/u0;", "Lg4/u1;", "Landroidx/compose/ui/node/g;", "rulerReaders", "d", "(ZLandroidx/compose/ui/node/j;Lr0/t0;)V", "a", "", "I", "size", "", "[Le4/i2;", "rulers", "", "[F", "values", "", "[B", "accessFlags", "Lr0/u0;", "layoutNodes", "f", "newRulers", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private i2[] rulers = new i2[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float[] values = new float[32];

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private byte[] accessFlags = new byte[32];

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private u0<u1<g>> layoutNodes = i1.b();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final u0<i2> newRulers = i1.b();

    public final void a() {
        int i15 = this.size;
        for (int i16 = 0; i16 < i15; i16++) {
            this.rulers[i16] = null;
            this.values[i16] = Float.NaN;
            this.accessFlags[i16] = 0;
        }
        this.size = 0;
    }

    public final boolean b(i2 ruler) {
        return pq.n.f0(this.rulers, ruler);
    }

    public final float c(i2 ruler, float defaultValue) {
        int iD0 = pq.n.D0(this.rulers, ruler);
        return iD0 < 0 ? defaultValue : this.values[iD0];
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0124 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0126 A[LOOP:5: B:51:0x00eb->B:65:0x0126, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x0129 A[EDGE_INSN: B:84:0x0129->B:66:0x0129 BREAK  A[LOOP:5: B:51:0x00eb->B:65:0x0126], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void d(boolean isLookingAhead, j node, t0<i2, u0<u1<g>>> rulerReaders) {
        char c15;
        char c16;
        long j15;
        long j16;
        g gVar;
        char c17;
        u0<u1<g>> u0VarU;
        int i15 = this.size;
        for (int i16 = 0; i16 < i15; i16++) {
            byte b15 = this.accessFlags[i16];
            if (b15 == 3) {
                this.newRulers.x(this.rulers[i16]);
            } else if (b15 != 0 && rulerReaders != null && (u0VarU = rulerReaders.u(this.rulers[i16])) != null) {
                this.layoutNodes.y(u0VarU);
            }
        }
        int i17 = this.size;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            c15 = 2;
            if (i18 >= i17) {
                break;
            }
            byte[] bArr = this.accessFlags;
            if (bArr[i18] == 2) {
                i19++;
            } else if (i19 > 0) {
                i2[] i2VarArr = this.rulers;
                i2VarArr[i18 - i19] = i2VarArr[i18];
            }
            bArr[i18] = 2;
            i18++;
        }
        int i25 = this.size;
        for (int i26 = i25 - i19; i26 < i25; i26++) {
            this.rulers[i26] = null;
        }
        this.size -= i19;
        j jVarM1 = node.M1();
        u0<i2> u0Var = this.newRulers;
        Object[] objArr = u0Var.elements;
        long[] jArr = u0Var.metadata;
        int length = jArr.length - 2;
        char c18 = 7;
        if (length >= 0) {
            int i27 = 0;
            j15 = 128;
            while (true) {
                long j17 = jArr[i27];
                j16 = 255;
                if ((((~j17) << c18) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i28 = 8 - ((~(i27 - length)) >>> 31);
                    int i29 = 0;
                    while (i29 < i28) {
                        if ((j17 & 255) < 128) {
                            (jVarM1 == null ? node : jVarM1).V1((i2) objArr[(i27 << 3) + i29]);
                        }
                        j17 >>= 8;
                        i29++;
                        c15 = c15;
                        c18 = c18;
                    }
                    c17 = c15;
                    c16 = c18;
                    if (i28 != 8) {
                        break;
                    }
                } else {
                    c17 = c15;
                    c16 = c18;
                }
                if (i27 == length) {
                    break;
                }
                i27++;
                c15 = c17;
                c18 = c16;
            }
        } else {
            c16 = 7;
            j15 = 128;
            j16 = 255;
        }
        this.newRulers.n();
        u0<u1<g>> u0Var2 = this.layoutNodes;
        Object[] objArr2 = u0Var2.elements;
        long[] jArr2 = u0Var2.metadata;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i35 = 0;
            while (true) {
                long j18 = jArr2[i35];
                if ((((~j18) << c16) & j18 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i35 != length2) {
                        break;
                        break;
                    }
                    i35++;
                } else {
                    int i36 = 8 - ((~(i35 - length2)) >>> 31);
                    for (int i37 = 0; i37 < i36; i37++) {
                        if ((j18 & j16) < j15 && (gVar = (g) ((u1) objArr2[(i35 << 3) + i37]).get()) != null) {
                            if (isLookingAhead) {
                                gVar.G1(false);
                            } else {
                                gVar.L1(false);
                            }
                        }
                        j18 >>= 8;
                    }
                    if (i36 != 8) {
                        break;
                    } else if (i35 != length2) {
                        break;
                    } else {
                        i35++;
                    }
                }
            }
        }
        this.layoutNodes.n();
    }

    public final void e(i2 ruler, float value) {
        int iD0 = pq.n.D0(this.rulers, ruler);
        if (iD0 >= 0) {
            float[] fArr = this.values;
            if (fArr[iD0] != value) {
                fArr[iD0] = value;
                this.accessFlags[iD0] = 1;
                return;
            } else {
                byte[] bArr = this.accessFlags;
                if (bArr[iD0] == 2) {
                    bArr[iD0] = 0;
                    return;
                }
                return;
            }
        }
        int i15 = this.size;
        i2[] i2VarArr = this.rulers;
        if (i15 == i2VarArr.length) {
            int i16 = i15 * 2;
            this.rulers = (i2[]) Arrays.copyOf(i2VarArr, i16);
            this.values = Arrays.copyOf(this.values, i16);
            this.accessFlags = Arrays.copyOf(this.accessFlags, i16);
        }
        this.rulers[i15] = ruler;
        this.accessFlags[i15] = 3;
        this.values[i15] = value;
        this.size++;
    }
}
