package jo0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jo0.h1, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ljo0/h1;", "", "", "Ljo0/e1;", "organizations", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OrganizationsResponseDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("organizations")
    private final List<OrganizationDtoDto> organizations;

    /* JADX WARN: Multi-variable type inference failed */
    public OrganizationsResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final List<OrganizationDtoDto> a() {
        return this.organizations;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OrganizationsResponseDto) && fr.t.c(this.organizations, ((OrganizationsResponseDto) other).organizations);
    }

    public int hashCode() {
        List<OrganizationDtoDto> list = this.organizations;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "OrganizationsResponseDto(organizations=" + this.organizations + ')';
    }

    public OrganizationsResponseDto(List<OrganizationDtoDto> list) {
        this.organizations = list;
    }

    public /* synthetic */ OrganizationsResponseDto(List list, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : list);
    }
}
