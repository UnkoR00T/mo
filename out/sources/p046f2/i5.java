package p046f2;

import fr.t;
import h2.o0;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lf2/i5;", "Lf2/h5;", "", "yearSelectionSkeleton", "selectedDateSkeleton", "selectedDateDescriptionSkeleton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "monthMillis", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "a", "(Ljava/lang/Long;Ljava/util/Locale;)Ljava/lang/String;", "dateMillis", "", "forContentDescription", "b", "(Ljava/lang/Long;Ljava/util/Locale;Z)Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getYearSelectionSkeleton", "()Ljava/lang/String;", "getSelectedDateSkeleton", "c", "getSelectedDateDescriptionSkeleton", "", "d", "Ljava/util/Map;", "formatterCache", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class i5 implements h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String yearSelectionSkeleton;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String selectedDateSkeleton;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String selectedDateDescriptionSkeleton;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> formatterCache = new LinkedHashMap();

    public i5(String str, String str2, String str3) {
        this.yearSelectionSkeleton = str;
        this.selectedDateSkeleton = str2;
        this.selectedDateDescriptionSkeleton = str3;
    }

    @Override // p046f2.h5
    public String a(Long monthMillis, Locale locale) {
        if (monthMillis == null) {
            return null;
        }
        return o0.b(monthMillis.longValue(), this.yearSelectionSkeleton, locale, this.formatterCache);
    }

    @Override // p046f2.h5
    public String b(Long dateMillis, Locale locale, boolean forContentDescription) {
        if (dateMillis == null) {
            return null;
        }
        return o0.b(dateMillis.longValue(), forContentDescription ? this.selectedDateDescriptionSkeleton : this.selectedDateSkeleton, locale, this.formatterCache);
    }

    public boolean equals(Object other) {
        if (!(other instanceof i5)) {
            return false;
        }
        i5 i5Var = (i5) other;
        return t.c(this.yearSelectionSkeleton, i5Var.yearSelectionSkeleton) && t.c(this.selectedDateSkeleton, i5Var.selectedDateSkeleton) && t.c(this.selectedDateDescriptionSkeleton, i5Var.selectedDateDescriptionSkeleton);
    }

    public int hashCode() {
        return (((this.yearSelectionSkeleton.hashCode() * 31) + this.selectedDateSkeleton.hashCode()) * 31) + this.selectedDateDescriptionSkeleton.hashCode();
    }
}
