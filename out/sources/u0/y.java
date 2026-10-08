package u0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000eB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000fR \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015¨\u0006\u0017"}, d2 = {"Lu0/y;", "", "", "arcModes", "", "timePoints", "", "y", "<init>", "([I[F[[F)V", "", "time", "v", "Loq/i0;", "a", "(F[F)V", "b", "Lu0/y$a;", "[[Lu0/y$a;", "arcs", "", "Z", "isExtrapolate", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a[][] arcs;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isExtrapolate = true;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0014\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001BA\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u000fJ\u0015\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u000fJ/\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001cR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010$R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u0014\u0010(\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001cR\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001cR\u0014\u0010,\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b+\u0010\u001cR\u0014\u0010.\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b-\u0010\u001cR\u0014\u00102\u001a\u00020/8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b3\u0010\u001cR\u0014\u00106\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b5\u0010\u001c¨\u00067"}, d2 = {"Lu0/y$a;", "", "", "mode", "", "time1", "time2", "x1", "y1", "x2", "y2", "<init>", "(IFFFFFF)V", "v", "j", "(F)F", "time", "Loq/i0;", "k", "(F)V", "d", "()F", "e", "f", "g", "c", "(FFFF)V", "a", "F", "h", "b", "i", "arcDistance", "tmpSinAngle", "tmpCosAngle", "", "[F", "lut", "oneOverDeltaTime", "l", "arcVelocity", "m", "vertical", "n", "ellipseA", "o", "ellipseB", "", "p", "Z", "isLinear", "q", "ellipseCenterX", "r", "ellipseCenterY", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float time1;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final float time2;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final float x1;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final float y1;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final float x2;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final float y2;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private float arcDistance;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private float tmpSinAngle;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private float tmpCosAngle;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final float[] lut;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final float oneOverDeltaTime;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final float arcVelocity;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private final float vertical;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        public final float ellipseA;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        public final float ellipseB;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        public final boolean isLinear;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        public final float ellipseCenterX;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        public final float ellipseCenterY;

        public a(int i15, float f15, float f16, float f17, float f18, float f19, float f25) {
            this.time1 = f15;
            this.time2 = f16;
            this.x1 = f17;
            this.y1 = f18;
            this.x2 = f19;
            this.y2 = f25;
            float f26 = f19 - f17;
            float f27 = f25 - f18;
            boolean z15 = true;
            boolean z16 = i15 == 1 || (i15 == 4 ? f27 > 0.0f : !(i15 != 5 || f27 >= 0.0f));
            float f28 = z16 ? -1.0f : 1.0f;
            this.vertical = f28;
            float f29 = 1 / (f16 - f15);
            this.oneOverDeltaTime = f29;
            this.lut = new float[101];
            boolean z17 = i15 == 3;
            if (z17 || Math.abs(f26) < 0.001f || Math.abs(f27) < 0.001f) {
                float fHypot = (float) Math.hypot(f27, f26);
                this.arcDistance = fHypot;
                this.arcVelocity = fHypot * f29;
                this.ellipseCenterX = f26 * f29;
                this.ellipseCenterY = f27 * f29;
                this.ellipseA = Float.NaN;
                this.ellipseB = Float.NaN;
            } else {
                this.ellipseA = f26 * f28;
                this.ellipseB = f27 * (-f28);
                this.ellipseCenterX = z16 ? f19 : f17;
                this.ellipseCenterY = z16 ? f18 : f25;
                c(f17, f18, f19, f25);
                this.arcVelocity = this.arcDistance * f29;
                z15 = z17;
            }
            this.isLinear = z15;
        }

        private final float j(float v15) {
            if (v15 <= 0.0f) {
                return 0.0f;
            }
            if (v15 >= 1.0f) {
                return 1.0f;
            }
            float f15 = v15 * 100;
            int i15 = (int) f15;
            float f16 = f15 - i15;
            float[] fArr = this.lut;
            float f17 = fArr[i15];
            return f17 + (f16 * (fArr[i15 + 1] - f17));
        }

        public final void c(float x15, float y15, float x16, float y16) {
            float f15;
            float f16;
            float fHypot;
            float f17 = x16 - x15;
            float f18 = y15 - y16;
            float[] fArr = z.f193980a;
            int length = fArr.length - 1;
            float f19 = length;
            float[] fArr2 = this.lut;
            if (1 <= length) {
                float f25 = f18;
                int i15 = 1;
                fHypot = 0.0f;
                float f26 = 0.0f;
                while (true) {
                    f16 = 0.0f;
                    double d15 = (float) (((((double) i15) * 90.0d) / ((double) length)) * 0.017453292519943295d);
                    float fSin = ((float) Math.sin(d15)) * f17;
                    float fCos = ((float) Math.cos(d15)) * f18;
                    f15 = f19;
                    fHypot += (float) Math.hypot(fSin - f26, fCos - f25);
                    fArr[i15] = fHypot;
                    if (i15 == length) {
                        break;
                    }
                    i15++;
                    f25 = fCos;
                    f19 = f15;
                    f26 = fSin;
                }
            } else {
                f15 = f19;
                f16 = 0.0f;
                fHypot = 0.0f;
            }
            this.arcDistance = fHypot;
            if (1 <= length) {
                int i16 = 1;
                while (true) {
                    fArr[i16] = fArr[i16] / fHypot;
                    if (i16 == length) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            int length2 = fArr2.length;
            for (int i17 = 0; i17 < length2; i17++) {
                float f27 = i17 / 100.0f;
                int iH = pq.n.h(fArr, f27, 0, 0, 6, null);
                if (iH >= 0) {
                    fArr2[i17] = iH / f15;
                } else {
                    if (iH == -1) {
                        fArr2[i17] = f16;
                    } else {
                        int i18 = -iH;
                        int i19 = i18 - 2;
                        float f28 = i19;
                        float f29 = fArr[i19];
                        fArr2[i17] = (f28 + ((f27 - f29) / (fArr[i18 - 1] - f29))) / f15;
                    }
                }
            }
        }

        public final float d() {
            float f15 = this.ellipseA * this.tmpCosAngle;
            return f15 * this.vertical * (this.arcVelocity / ((float) Math.hypot(f15, (-this.ellipseB) * this.tmpSinAngle)));
        }

        public final float e() {
            float f15 = this.ellipseA * this.tmpCosAngle;
            float f16 = (-this.ellipseB) * this.tmpSinAngle;
            return f16 * this.vertical * (this.arcVelocity / ((float) Math.hypot(f15, f16)));
        }

        public final float f(float time) {
            float f15 = (time - this.time1) * this.oneOverDeltaTime;
            float f16 = this.x1;
            return f16 + (f15 * (this.x2 - f16));
        }

        public final float g(float time) {
            float f15 = (time - this.time1) * this.oneOverDeltaTime;
            float f16 = this.y1;
            return f16 + (f15 * (this.y2 - f16));
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final float getTime1() {
            return this.time1;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final float getTime2() {
            return this.time2;
        }

        public final void k(float time) {
            double dJ = j((this.vertical == -1.0f ? this.time2 - time : time - this.time1) * this.oneOverDeltaTime) * 1.5707964f;
            this.tmpSinAngle = (float) Math.sin(dJ);
            this.tmpCosAngle = (float) Math.cos(dJ);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[PHI: r10
      0x0028: PHI (r10v1 int) = (r10v0 int), (r10v3 int), (r10v4 int) binds: [B:5:0x0018, B:10:0x0021, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0031  */
    public y(int[] iArr, float[] fArr, float[][] fArr2) {
        int i15;
        int i16 = 1;
        int length = fArr.length - 1;
        a[][] aVarArr = new a[length][];
        int i17 = 1;
        int i18 = 1;
        int i19 = 0;
        while (i19 < length) {
            int i25 = iArr[i19];
            int i26 = 3;
            if (i25 == 0) {
                i15 = i26;
            } else if (i25 == i16) {
                i17 = i16;
                i15 = i17;
            } else {
                if (i25 != 2) {
                    if (i25 != 3) {
                        i26 = 4;
                        if (i25 != 4) {
                            i26 = 5;
                            if (i25 != 5) {
                                i15 = i18;
                            } else {
                                i15 = i26;
                            }
                        } else {
                            i15 = i26;
                        }
                    } else {
                        if (i17 != i16) {
                            i17 = i16;
                        }
                        i15 = i17;
                    }
                }
                i17 = 2;
                i15 = i17;
            }
            float[] fArr3 = fArr2[i19];
            int i27 = i19 + 1;
            float[] fArr4 = fArr2[i27];
            float f15 = fArr[i19];
            float f16 = fArr[i27];
            int length2 = (fArr3.length % 2) + (fArr3.length / 2);
            a[] aVarArr2 = new a[length2];
            int i28 = 0;
            while (i28 < length2) {
                int i29 = i28 * 2;
                int i35 = i28;
                int i36 = i29 + 1;
                aVarArr2[i35] = new a(i15, f15, f16, fArr3[i29], fArr3[i36], fArr4[i29], fArr4[i36]);
                i28 = i35 + 1;
            }
            aVarArr[i19] = aVarArr2;
            i19 = i27;
            i18 = i15;
            i16 = 1;
        }
        this.arcs = aVarArr;
    }

    public final void a(float time, float[] v15) {
        a[][] aVarArr = this.arcs;
        int length = aVarArr.length - 1;
        int i15 = 0;
        float time1 = aVarArr[0][0].getTime1();
        float time2 = aVarArr[length][0].getTime2();
        int length2 = v15.length;
        if (!this.isExtrapolate) {
            time = Math.min(Math.max(time, time1), time2);
        } else if (time < time1 || time > time2) {
            if (time > time2) {
                time1 = time2;
            } else {
                length = 0;
            }
            float f15 = time - time1;
            int i16 = 0;
            while (i15 < length2 - 1) {
                a aVar = aVarArr[length][i16];
                if (aVar.isLinear) {
                    v15[i15] = aVar.f(time1) + (aVar.ellipseCenterX * f15);
                    v15[i15 + 1] = aVar.g(time1) + (aVar.ellipseCenterY * f15);
                } else {
                    aVar.k(time1);
                    v15[i15] = aVar.ellipseCenterX + (aVar.ellipseA * aVar.tmpSinAngle) + (aVar.d() * f15);
                    v15[i15 + 1] = aVar.ellipseCenterY + (aVar.ellipseB * aVar.tmpCosAngle) + (aVar.e() * f15);
                }
                i15 += 2;
                i16++;
            }
            return;
        }
        boolean z15 = false;
        for (a[] aVarArr2 : aVarArr) {
            int i17 = 0;
            int i18 = 0;
            while (i17 < length2 - 1) {
                a aVar2 = aVarArr2[i18];
                if (time <= aVar2.getTime2()) {
                    if (aVar2.isLinear) {
                        v15[i17] = aVar2.f(time);
                        v15[i17 + 1] = aVar2.g(time);
                    } else {
                        aVar2.k(time);
                        v15[i17] = aVar2.ellipseCenterX + (aVar2.ellipseA * aVar2.tmpSinAngle);
                        v15[i17 + 1] = aVar2.ellipseCenterY + (aVar2.ellipseB * aVar2.tmpCosAngle);
                    }
                    z15 = true;
                }
                i17 += 2;
                i18++;
            }
            if (z15) {
                return;
            }
        }
    }

    public final void b(float time, float[] v15) {
        a[][] aVarArr = this.arcs;
        float time1 = aVarArr[0][0].getTime1();
        float time2 = aVarArr[aVarArr.length - 1][0].getTime2();
        if (time < time1) {
            time = time1;
        }
        if (time <= time2) {
            time2 = time;
        }
        int length = v15.length;
        boolean z15 = false;
        for (a[] aVarArr2 : aVarArr) {
            int i15 = 0;
            int i16 = 0;
            while (i15 < length - 1) {
                a aVar = aVarArr2[i16];
                if (time2 <= aVar.getTime2()) {
                    if (aVar.isLinear) {
                        v15[i15] = aVar.ellipseCenterX;
                        v15[i15 + 1] = aVar.ellipseCenterY;
                    } else {
                        aVar.k(time2);
                        v15[i15] = aVar.d();
                        v15[i15 + 1] = aVar.e();
                    }
                    z15 = true;
                }
                i15 += 2;
                i16++;
            }
            if (z15) {
                return;
            }
        }
    }
}
