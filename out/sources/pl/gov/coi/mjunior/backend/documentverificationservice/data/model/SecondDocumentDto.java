package pl.gov.coi.mjunior.backend.documentverificationservice.data.model;

import androidx.annotation.Keep;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lpl/gov/coi/mjunior/backend/documentverificationservice/data/model/SecondDocumentDto;", "", "data", "", "scope", "", "<init>", "(Ljava/lang/String;I)V", "getData", "()Ljava/lang/String;", "getScope", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "documentverificationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SecondDocumentDto {

    @c("data")
    private final String data;

    @c("scope")
    private final int scope;

    public SecondDocumentDto(String str, int i15) {
        this.data = str;
        this.scope = i15;
    }

    public static /* synthetic */ SecondDocumentDto copy$default(SecondDocumentDto secondDocumentDto, String str, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            str = secondDocumentDto.data;
        }
        if ((i16 & 2) != 0) {
            i15 = secondDocumentDto.scope;
        }
        return secondDocumentDto.copy(str, i15);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getScope() {
        return this.scope;
    }

    public final SecondDocumentDto copy(String data, int scope) {
        return new SecondDocumentDto(data, scope);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SecondDocumentDto)) {
            return false;
        }
        SecondDocumentDto secondDocumentDto = (SecondDocumentDto) other;
        return t.c(this.data, secondDocumentDto.data) && this.scope == secondDocumentDto.scope;
    }

    public final String getData() {
        return this.data;
    }

    public final int getScope() {
        return this.scope;
    }

    public int hashCode() {
        return (this.data.hashCode() * 31) + Integer.hashCode(this.scope);
    }

    public String toString() {
        return "SecondDocumentDto(data=" + this.data + ", scope=" + this.scope + ')';
    }
}
