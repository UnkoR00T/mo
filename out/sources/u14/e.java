package u14;

import fr.t;
import fu.r;
import java.util.Iterator;
import java.util.Locale;
import mx.Label;
import oq.p;
import org.bouncycastle.asn1.eac.CertificateBody;
import p071kotlin.Metadata;
import pq.v;
import vy.Address;
import w04.LocationDetails;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lu14/e;", "Le14/d;", "Luy/c;", "geocoderManager", "<init>", "(Luy/c;)V", "", "postalCode", "", "d", "(Ljava/lang/String;)Z", "Le14/d$a;", "params", "Lw04/c;", "b", "(Le14/d$a;Ltq/e;)Ljava/lang/Object;", "a", "Luy/c;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements e14.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final uy.c geocoderManager;

    public e(uy.c cVar) {
        this.geocoderManager = cVar;
    }

    private final boolean d(String postalCode) {
        return postalCode != null && postalCode.length() == 6;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0125  */
    @Override // e14.d
    public Object b(e14.d.Params params, tq.e<? super LocationDetails> eVar) {
        String postalCode;
        String str;
        String text;
        String lowerCase;
        Object next;
        dx.i<dx.b, Address> iVarA = this.geocoderManager.a(params.getCoordinates());
        if (iVarA instanceof dx.i.Left) {
            return new LocationDetails(null, null, null, null, null, null, null, params.getCoordinates(), CertificateBody.profileType, null);
        }
        if (!(iVarA instanceof dx.i.Right)) {
            throw new p();
        }
        dx.i.Right right = (dx.i.Right) iVarA;
        if (!d(((Address) right.b()).getPostalCode()) || (postalCode = ((Address) right.b()).getPostalCode()) == null) {
            postalCode = "";
        }
        if (((Address) right.b()).getThoroughfare() != null && ((Address) right.b()).getSubThoroughfare() != null) {
            str = ((Address) right.b()).getThoroughfare() + ' ' + ((Address) right.b()).getSubThoroughfare();
        } else if (((Address) right.b()).getThoroughfare() != null) {
            str = "" + ((Address) right.b()).getThoroughfare();
        } else {
            str = "";
        }
        Label labelB = mx.b.b(str, "streetAndNumber");
        String locality = ((Address) right.b()).getLocality();
        if (locality == null) {
            locality = "";
        }
        Label labelB2 = mx.b.b(locality, "cityName");
        Label labelB3 = mx.b.b(postalCode, "postalCode");
        String adminArea = ((Address) right.b()).getAdminArea();
        if (adminArea == null || (lowerCase = adminArea.toLowerCase(Locale.ROOT)) == null) {
            text = "";
        } else {
            Iterator<T> it = params.b().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!t.c(((Label) next).getText(), v.x0(r.V0(lowerCase, new String[]{" "}, false, 0, 6, null))));
            Label label = (Label) next;
            text = label != null ? label.getText() : null;
            if (text == null) {
                text = "";
            }
        }
        Label labelB4 = mx.b.b(text, "voivodeshipName");
        String countryName = ((Address) right.b()).getCountryName();
        String str2 = countryName == null ? "" : countryName;
        String countryCode = ((Address) right.b()).getCountryCode();
        return new LocationDetails(null, labelB, labelB2, labelB3, labelB4, str2, countryCode == null ? "" : countryCode, params.getCoordinates(), 1, null);
    }
}
