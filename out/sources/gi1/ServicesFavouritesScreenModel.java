package gi1;

import er.p;
import fr.t;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: gi1.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b!\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010(\u001a\u0004\b\u001a\u0010\u0013R)\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0006¢\u0006\f\n\u0004\b#\u0010)\u001a\u0004\b%\u0010*¨\u0006+"}, d2 = {"Lgi1/b;", "", "Li50/a;", "scaffoldData", "Lmx/a;", "infoLabel", "Lgi1/c;", "userServiceSection", "Lgi1/a;", "otherServiceSection", "", "addServiceContentDescription", "Lkotlin/Function2;", "", "Loq/i0;", "reorderFavoriteServices", "<init>", "(Li50/a;Lmx/a;Lgi1/c;Lgi1/a;Ljava/lang/String;Ler/p;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "e", "()Li50/a;", "b", "Lmx/a;", "()Lmx/a;", "c", "Lgi1/c;", "f", "()Lgi1/c;", "d", "Lgi1/a;", "()Lgi1/a;", "Ljava/lang/String;", "Ler/p;", "()Ler/p;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ServicesFavouritesScreenModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BaseScaffoldData scaffoldData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label infoLabel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final UserServiceSection userServiceSection;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final OtherServiceSection otherServiceSection;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addServiceContentDescription;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final p<Integer, Integer, i0> reorderFavoriteServices;

    /* JADX WARN: Multi-variable type inference failed */
    public ServicesFavouritesScreenModel(BaseScaffoldData baseScaffoldData, Label label, UserServiceSection userServiceSection, OtherServiceSection otherServiceSection, String str, p<? super Integer, ? super Integer, i0> pVar) {
        this.scaffoldData = baseScaffoldData;
        this.infoLabel = label;
        this.userServiceSection = userServiceSection;
        this.otherServiceSection = otherServiceSection;
        this.addServiceContentDescription = str;
        this.reorderFavoriteServices = pVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAddServiceContentDescription() {
        return this.addServiceContentDescription;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getInfoLabel() {
        return this.infoLabel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final OtherServiceSection getOtherServiceSection() {
        return this.otherServiceSection;
    }

    public final p<Integer, Integer, i0> d() {
        return this.reorderFavoriteServices;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final BaseScaffoldData getScaffoldData() {
        return this.scaffoldData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServicesFavouritesScreenModel)) {
            return false;
        }
        ServicesFavouritesScreenModel servicesFavouritesScreenModel = (ServicesFavouritesScreenModel) other;
        return t.c(this.scaffoldData, servicesFavouritesScreenModel.scaffoldData) && t.c(this.infoLabel, servicesFavouritesScreenModel.infoLabel) && t.c(this.userServiceSection, servicesFavouritesScreenModel.userServiceSection) && t.c(this.otherServiceSection, servicesFavouritesScreenModel.otherServiceSection) && t.c(this.addServiceContentDescription, servicesFavouritesScreenModel.addServiceContentDescription) && t.c(this.reorderFavoriteServices, servicesFavouritesScreenModel.reorderFavoriteServices);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final UserServiceSection getUserServiceSection() {
        return this.userServiceSection;
    }

    public int hashCode() {
        return (((((((((this.scaffoldData.hashCode() * 31) + this.infoLabel.hashCode()) * 31) + this.userServiceSection.hashCode()) * 31) + this.otherServiceSection.hashCode()) * 31) + this.addServiceContentDescription.hashCode()) * 31) + this.reorderFavoriteServices.hashCode();
    }

    public String toString() {
        return "ServicesFavouritesScreenModel(scaffoldData=" + this.scaffoldData + ", infoLabel=" + this.infoLabel + ", userServiceSection=" + this.userServiceSection + ", otherServiceSection=" + this.otherServiceSection + ", addServiceContentDescription=" + this.addServiceContentDescription + ", reorderFavoriteServices=" + this.reorderFavoriteServices + ')';
    }
}
