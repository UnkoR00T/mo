package b50;

import fr.k;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: b50.b, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Lb50/b;", "", "", "enabled", "isSelected", "isError", "<init>", "(ZZZ)V", "a", "(ZZZ)Lb50/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "c", "()Z", "b", "e", "d", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RadioButtonItemData {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f16672d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean enabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSelected;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isError;

    public RadioButtonItemData(boolean z15, boolean z16, boolean z17) {
        this.enabled = z15;
        this.isSelected = z16;
        this.isError = z17;
    }

    public static /* synthetic */ RadioButtonItemData b(RadioButtonItemData radioButtonItemData, boolean z15, boolean z16, boolean z17, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = radioButtonItemData.enabled;
        }
        if ((i15 & 2) != 0) {
            z16 = radioButtonItemData.isSelected;
        }
        if ((i15 & 4) != 0) {
            z17 = radioButtonItemData.isError;
        }
        return radioButtonItemData.a(z15, z16, z17);
    }

    public final RadioButtonItemData a(boolean enabled, boolean isSelected, boolean isError) {
        return new RadioButtonItemData(enabled, isSelected, isError);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RadioButtonItemData)) {
            return false;
        }
        RadioButtonItemData radioButtonItemData = (RadioButtonItemData) other;
        return this.enabled == radioButtonItemData.enabled && this.isSelected == radioButtonItemData.isSelected && this.isError == radioButtonItemData.isError;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.enabled) * 31) + Boolean.hashCode(this.isSelected)) * 31) + Boolean.hashCode(this.isError);
    }

    public String toString() {
        return "RadioButtonItemData(enabled=" + this.enabled + ", isSelected=" + this.isSelected + ", isError=" + this.isError + ')';
    }

    public /* synthetic */ RadioButtonItemData(boolean z15, boolean z16, boolean z17, int i15, k kVar) {
        this((i15 & 1) != 0 ? true : z15, (i15 & 2) != 0 ? false : z16, (i15 & 4) != 0 ? false : z17);
    }
}
