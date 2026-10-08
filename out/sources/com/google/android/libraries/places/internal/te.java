package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class te implements ez {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final ez f33785a = new te();

    private te() {
    }

    @Override // com.google.android.libraries.places.internal.ez
    public final boolean b(int i15) {
        ue ueVar;
        switch (i15) {
            case 0:
                ueVar = ue.EV_CONNECTOR_TYPE_UNSPECIFIED;
                break;
            case 1:
                ueVar = ue.EV_CONNECTOR_TYPE_OTHER;
                break;
            case 2:
                ueVar = ue.EV_CONNECTOR_TYPE_J1772;
                break;
            case 3:
                ueVar = ue.EV_CONNECTOR_TYPE_TYPE_2;
                break;
            case 4:
                ueVar = ue.EV_CONNECTOR_TYPE_CHADEMO;
                break;
            case 5:
                ueVar = ue.EV_CONNECTOR_TYPE_CCS_COMBO_1;
                break;
            case 6:
                ueVar = ue.EV_CONNECTOR_TYPE_CCS_COMBO_2;
                break;
            case 7:
                ueVar = ue.EV_CONNECTOR_TYPE_TESLA;
                break;
            case 8:
                ueVar = ue.EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T;
                break;
            case 9:
                ueVar = ue.EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET;
                break;
            case 10:
                ueVar = ue.EV_CONNECTOR_TYPE_NACS;
                break;
            default:
                ueVar = null;
                break;
        }
        return ueVar != null;
    }
}
