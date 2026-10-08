package mz;

import android.net.Uri;
import p071kotlin.Metadata;
import vy.Coordinates;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0005\u0003J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lmz/f;", "Lmz/b0;", "", "a", "()Ljava/lang/String;", "b", "Lmz/f$a;", "Lmz/f$b;", "intent_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f extends b0 {

    /* JADX INFO: renamed from: mz.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\n¨\u0006\u0016"}, d2 = {"Lmz/f$a;", "Lmz/f;", "", "address", "<init>", "(Ljava/lang/String;)V", "Landroid/net/Uri;", "c", "()Landroid/net/Uri;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getAddress", "intent_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ByAddress implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String address;

        public ByAddress(String str) {
            this.address = str;
        }

        @Override // mz.f, kx.g
        public /* bridge */ String a() {
            return super.a();
        }

        @Override // mz.b0
        /* JADX INFO: renamed from: c */
        public Uri getUri() {
            return Uri.parse("geo:0,0?q=" + Uri.encode(this.address));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ByAddress) && fr.t.c(this.address, ((ByAddress) other).address);
        }

        public int hashCode() {
            return this.address.hashCode();
        }

        public String toString() {
            return "ByAddress(address=" + this.address + ')';
        }
    }

    /* JADX INFO: renamed from: mz.f$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lmz/f$b;", "Lmz/f;", "Lvy/c;", "coordinates", "", "placeLabel", "<init>", "(Lvy/c;Ljava/lang/String;)V", "Landroid/net/Uri;", "c", "()Landroid/net/Uri;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvy/c;", "b", "Ljava/lang/String;", "intent_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ByCoordinates implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Coordinates coordinates;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String placeLabel;

        public ByCoordinates(Coordinates coordinates, String str) {
            this.coordinates = coordinates;
            this.placeLabel = str;
        }

        @Override // mz.f, kx.g
        public /* bridge */ String a() {
            return super.a();
        }

        @Override // mz.b0
        /* JADX INFO: renamed from: c */
        public Uri getUri() {
            boolean z15 = this.placeLabel == null;
            if (z15) {
                return Uri.parse("geo:" + this.coordinates.getLatitude() + ',' + this.coordinates.getLongitude());
            }
            if (z15) {
                throw new oq.p();
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append("geo:0,0?q=");
            StringBuilder sb6 = new StringBuilder();
            sb6.append(this.coordinates.getLatitude());
            sb6.append(',');
            sb6.append(this.coordinates.getLongitude());
            sb5.append(sb6.toString());
            sb5.append('(' + Uri.encode(this.placeLabel) + ')');
            return Uri.parse(sb5.toString());
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ByCoordinates)) {
                return false;
            }
            ByCoordinates byCoordinates = (ByCoordinates) other;
            return fr.t.c(this.coordinates, byCoordinates.coordinates) && fr.t.c(this.placeLabel, byCoordinates.placeLabel);
        }

        public int hashCode() {
            int iHashCode = this.coordinates.hashCode() * 31;
            String str = this.placeLabel;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ByCoordinates(coordinates=" + this.coordinates + ", placeLabel=" + this.placeLabel + ')';
        }
    }

    @Override // kx.g
    default String a() {
        return "android.intent.action.VIEW";
    }
}
