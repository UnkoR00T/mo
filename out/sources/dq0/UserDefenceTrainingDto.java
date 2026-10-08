package dq0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: dq0.n0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0007R \u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Ldq0/n0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "Ldq0/b;", "a", "Ljava/util/List;", "()Ljava/util/List;", "days", "b", "I", "id", "c", "Ljava/lang/String;", "getName$annotations", "()V", "name", "Ldq0/h;", "d", "Ldq0/h;", "getType", "()Ldq0/h;", "type", "militaryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserDefenceTrainingDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("days")
    private final List<DefenceTrainingDayDto> days;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("id")
    private final int id;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("name")
    private final String name;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("type")
    private final DefenceTrainingTypeDto type;

    public final List<DefenceTrainingDayDto> a() {
        return this.days;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserDefenceTrainingDto)) {
            return false;
        }
        UserDefenceTrainingDto userDefenceTrainingDto = (UserDefenceTrainingDto) other;
        return fr.t.c(this.days, userDefenceTrainingDto.days) && this.id == userDefenceTrainingDto.id && fr.t.c(this.name, userDefenceTrainingDto.name) && fr.t.c(this.type, userDefenceTrainingDto.type);
    }

    public int hashCode() {
        int iHashCode = ((((this.days.hashCode() * 31) + Integer.hashCode(this.id)) * 31) + this.name.hashCode()) * 31;
        DefenceTrainingTypeDto defenceTrainingTypeDto = this.type;
        return iHashCode + (defenceTrainingTypeDto == null ? 0 : defenceTrainingTypeDto.hashCode());
    }

    public String toString() {
        return "UserDefenceTrainingDto(days=" + this.days + ", id=" + this.id + ", name=" + this.name + ", type=" + this.type + ')';
    }
}
