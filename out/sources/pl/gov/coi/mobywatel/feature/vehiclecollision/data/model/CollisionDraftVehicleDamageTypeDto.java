package pl.gov.coi.mobywatel.feature.vehiclecollision.data.model;

import androidx.annotation.Keep;
import p071kotlin.Metadata;
import wq.a;
import wq.b;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftVehicleDamageTypeDto;", "", "<init>", "(Ljava/lang/String;I)V", "FrontDamage", "BackDamage", "TopDamage", "LeftFrontDamage", "RightFrontDamage", "LeftSideDamage", "RightSideDamage", "LeftBackDamage", "RightBackDamage", "Unknown", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum CollisionDraftVehicleDamageTypeDto {
    FrontDamage,
    BackDamage,
    TopDamage,
    LeftFrontDamage,
    RightFrontDamage,
    LeftSideDamage,
    RightSideDamage,
    LeftBackDamage,
    RightBackDamage,
    Unknown;

    private static final /* synthetic */ a $ENTRIES = b.a(values());

    public static a<CollisionDraftVehicleDamageTypeDto> getEntries() {
        return $ENTRIES;
    }
}
