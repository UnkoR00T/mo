package pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto;

import androidx.annotation.Keep;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/SummaryCheckBoxDto;", "", "statementChecked", "", "<init>", "(Z)V", "getStatementChecked", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SummaryCheckBoxDto {
    public static final int $stable = 0;

    @c("statementChecked")
    private final boolean statementChecked;

    public SummaryCheckBoxDto(boolean z15) {
        this.statementChecked = z15;
    }

    public static /* synthetic */ SummaryCheckBoxDto copy$default(SummaryCheckBoxDto summaryCheckBoxDto, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = summaryCheckBoxDto.statementChecked;
        }
        return summaryCheckBoxDto.copy(z15);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getStatementChecked() {
        return this.statementChecked;
    }

    public final SummaryCheckBoxDto copy(boolean statementChecked) {
        return new SummaryCheckBoxDto(statementChecked);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SummaryCheckBoxDto) && this.statementChecked == ((SummaryCheckBoxDto) other).statementChecked;
    }

    public final boolean getStatementChecked() {
        return this.statementChecked;
    }

    public int hashCode() {
        return Boolean.hashCode(this.statementChecked);
    }

    public String toString() {
        return "SummaryCheckBoxDto(statementChecked=" + this.statementChecked + ')';
    }
}
