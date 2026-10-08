package mg2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltq0/t;", "", "a", "(Ltq0/t;)I", "landregistry_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f126442a;

        static {
            int[] iArr = new int[tq0.t.values().length];
            try {
                iArr[tq0.t.LandProperty.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[tq0.t.LandGrantedForPerpetualUse.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[tq0.t.LandGrantedForPerpetualUseWithBuildingAsSeparateProperty.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[tq0.t.LandGrantedForPerpetualUseWithEquipmentAsSeparateProperty.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[tq0.t.LandGrantedForPerpetualUseWithEquipmentAndBuildingAsSeparateProperty.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[tq0.t.BuildingAsSeparateProperty.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[tq0.t.PremisesAsSeparateProperty.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[tq0.t.CooperativePropertyOwnershipRightToResidentialPremises.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[tq0.t.CooperativePropertyRightToCommercialPremises.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[tq0.t.CooperativePropertyRightToDetachedHouse.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[tq0.t.CooperativePropertyOwnershipRightToPremises.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f126442a = iArr;
        }
    }

    public static final int a(tq0.t tVar) {
        switch (a.f126442a[tVar.ordinal()]) {
            case 1:
                return xf2.a.G1;
            case 2:
                return xf2.a.C1;
            case 3:
                return xf2.a.D1;
            case 4:
                return xf2.a.F1;
            case 5:
                return xf2.a.E1;
            case 6:
                return xf2.a.f218414x1;
            case 7:
                return xf2.a.H1;
            case 8:
                return xf2.a.f218420z1;
            case 9:
                return xf2.a.A1;
            case 10:
                return xf2.a.B1;
            case 11:
                return xf2.a.f218417y1;
            default:
                throw new oq.p();
        }
    }
}
