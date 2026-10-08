package pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto;

import androidx.annotation.Keep;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDataSplitDto;", "", "firstLine", "", "secondLine", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFirstLine", "()Ljava/lang/String;", "getSecondLine", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChildPassportApplicationDataSplitDto {
    public static final int $stable = 0;

    @c("firstLine")
    private final String firstLine;

    @c("secondLine")
    private final String secondLine;

    public ChildPassportApplicationDataSplitDto(String str, String str2) {
        this.firstLine = str;
        this.secondLine = str2;
    }

    public static /* synthetic */ ChildPassportApplicationDataSplitDto copy$default(ChildPassportApplicationDataSplitDto childPassportApplicationDataSplitDto, String str, String str2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = childPassportApplicationDataSplitDto.firstLine;
        }
        if ((i15 & 2) != 0) {
            str2 = childPassportApplicationDataSplitDto.secondLine;
        }
        return childPassportApplicationDataSplitDto.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFirstLine() {
        return this.firstLine;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSecondLine() {
        return this.secondLine;
    }

    public final ChildPassportApplicationDataSplitDto copy(String firstLine, String secondLine) {
        return new ChildPassportApplicationDataSplitDto(firstLine, secondLine);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChildPassportApplicationDataSplitDto)) {
            return false;
        }
        ChildPassportApplicationDataSplitDto childPassportApplicationDataSplitDto = (ChildPassportApplicationDataSplitDto) other;
        return t.c(this.firstLine, childPassportApplicationDataSplitDto.firstLine) && t.c(this.secondLine, childPassportApplicationDataSplitDto.secondLine);
    }

    public final String getFirstLine() {
        return this.firstLine;
    }

    public final String getSecondLine() {
        return this.secondLine;
    }

    public int hashCode() {
        return (this.firstLine.hashCode() * 31) + this.secondLine.hashCode();
    }

    public String toString() {
        return "ChildPassportApplicationDataSplitDto(firstLine=" + this.firstLine + ", secondLine=" + this.secondLine + ')';
    }
}
