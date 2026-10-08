package oy0;

import kh0.l;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkh0/l;", "Lpy0/a;", "a", "(Lkh0/l;)Lpy0/a;", "airquality_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: oy0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C3717a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f150629a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.B.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.C.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l.D.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[l.E.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[l.F.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f150629a = iArr;
        }
    }

    public static final py0.a a(l lVar) {
        switch (C3717a.f150629a[lVar.ordinal()]) {
            case 1:
                return py0.a.A;
            case 2:
                return py0.a.B;
            case 3:
                return py0.a.C;
            case 4:
                return py0.a.D;
            case 5:
                return py0.a.E;
            case 6:
                return py0.a.F;
            default:
                return py0.a.UNKNOWN;
        }
    }
}
