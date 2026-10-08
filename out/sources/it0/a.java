package it0;

import dx.b;
import dx.i;
import ht0.BEPlaceDetails;
import ht0.BEPlaceSuggestion;
import java.util.List;
import p071kotlin.Metadata;
import tq.e;
import vy.Coordinates;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J2\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u000f\u0010\u000bJ$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\u0011\u001a\u00020\u0010H¦@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lit0/a;", "", "", "query", "Lht0/d;", "sessionToken", "Ldx/i;", "Ldx/b;", "", "Lht0/c;", "c", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lht0/b;", "placeId", "Lht0/a;", "b", "Lvy/c;", "coordinates", "a", "(Lvy/c;Ltq/e;)Ljava/lang/Object;", "places_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    Object a(Coordinates coordinates, e<? super i<? extends b, BEPlaceDetails>> eVar);

    Object b(String str, String str2, e<? super i<? extends b, BEPlaceDetails>> eVar);

    Object c(String str, String str2, e<? super i<? extends b, ? extends List<BEPlaceSuggestion>>> eVar);
}
