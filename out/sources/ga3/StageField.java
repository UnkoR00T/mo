package ga3;

import fr.k;
import fr.t;
import fz.e;
import java.util.UUID;
import p071kotlin.Metadata;
import vy.Coordinates;
import z93.Place;

/* JADX INFO: renamed from: ga3.d, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ>\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010!\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010#\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010%\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b$\u0010 R\u0019\u0010)\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\b\u001f\u0010'\u001a\u0004\b\u001d\u0010(¨\u0006*"}, d2 = {"Lga3/d;", "", "", "id", "Lga3/a;", "Lfz/e$a;", "dateRange", "Lz93/c;", "place", "<init>", "(Ljava/lang/String;Lga3/a;Lga3/a;)V", "a", "(Ljava/lang/String;Lga3/a;Lga3/a;)Lga3/d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "Lga3/a;", "c", "()Lga3/a;", "f", "d", "Z", "g", "()Z", "isDateRangeSelected", "h", "isPlaceSelected", "i", "isValid", "Lga3/b;", "Lga3/b;", "()Lga3/b;", "firstInvalidFieldType", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StageField {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f71542h;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Field<e.LocalDate> dateRange;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Field<Place> place;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isDateRangeSelected;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isPlaceSelected;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean isValid;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final b firstInvalidFieldType;

    static {
        int i15 = hz.b.f86845b;
        f71542h = i15 | Coordinates.f208679c | i15 | e.LocalDate.f68899c;
    }

    public StageField() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StageField b(StageField stageField, String str, Field field, Field field2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = stageField.id;
        }
        if ((i15 & 2) != 0) {
            field = stageField.dateRange;
        }
        if ((i15 & 4) != 0) {
            field2 = stageField.place;
        }
        return stageField.a(str, field, field2);
    }

    public final StageField a(String id5, Field<e.LocalDate> dateRange, Field<Place> place) {
        return new StageField(id5, dateRange, place);
    }

    public final Field<e.LocalDate> c() {
        return this.dateRange;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b getFirstInvalidFieldType() {
        return this.firstInvalidFieldType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StageField)) {
            return false;
        }
        StageField stageField = (StageField) other;
        return t.c(this.id, stageField.id) && t.c(this.dateRange, stageField.dateRange) && t.c(this.place, stageField.place);
    }

    public final Field<Place> f() {
        return this.place;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsDateRangeSelected() {
        return this.isDateRangeSelected;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsPlaceSelected() {
        return this.isPlaceSelected;
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.dateRange.hashCode()) * 31) + this.place.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    public String toString() {
        return "StageField(id=" + this.id + ", dateRange=" + this.dateRange + ", place=" + this.place + ')';
    }

    public StageField(String str, Field<e.LocalDate> field, Field<Place> field2) {
        this.id = str;
        this.dateRange = field;
        this.place = field2;
        boolean z15 = false;
        this.isDateRangeSelected = field.d() != null;
        this.isPlaceSelected = field2.d() != null;
        if (field.getValidationState().a() && field2.getValidationState().a()) {
            z15 = true;
        }
        this.isValid = z15;
        this.firstInvalidFieldType = field.getValidationState() instanceof hz.b.Invalid ? b.DATE : field2.getValidationState() instanceof hz.b.Invalid ? b.PLACE : null;
    }

    public /* synthetic */ StageField(String str, Field field, Field field2, int i15, k kVar) {
        this((i15 & 1) != 0 ? UUID.randomUUID().toString() : str, (i15 & 2) != 0 ? new Field(null, null, 2, null) : field, (i15 & 4) != 0 ? new Field(null, null, 2, null) : field2);
    }
}
