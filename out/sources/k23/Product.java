package k23;

import fr.t;
import java.util.Map;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: renamed from: k23.e, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ>\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, d2 = {"Lk23/e;", "", "Lk23/j;", "productData", "Lk23/i;", "placeOfPurchaseData", "", "Lk23/c;", "Lk23/b;", "businessData", "<init>", "(Lk23/j;Lk23/i;Ljava/util/Map;)V", "a", "(Lk23/j;Lk23/i;Ljava/util/Map;)Lk23/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lk23/j;", "e", "()Lk23/j;", "b", "Lk23/i;", "d", "()Lk23/i;", "c", "Ljava/util/Map;", "()Ljava/util/Map;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Product {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductData productData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final PlaceOfPurchaseData placeOfPurchaseData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<c, BusinessDetailsData> businessData;

    public Product(ProductData productData, PlaceOfPurchaseData placeOfPurchaseData, Map<c, BusinessDetailsData> map) {
        this.productData = productData;
        this.placeOfPurchaseData = placeOfPurchaseData;
        this.businessData = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Product b(Product product, ProductData productData, PlaceOfPurchaseData placeOfPurchaseData, Map map, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            productData = product.productData;
        }
        if ((i15 & 2) != 0) {
            placeOfPurchaseData = product.placeOfPurchaseData;
        }
        if ((i15 & 4) != 0) {
            map = product.businessData;
        }
        return product.a(productData, placeOfPurchaseData, map);
    }

    public final Product a(ProductData productData, PlaceOfPurchaseData placeOfPurchaseData, Map<c, BusinessDetailsData> businessData) {
        return new Product(productData, placeOfPurchaseData, businessData);
    }

    public final Map<c, BusinessDetailsData> c() {
        return this.businessData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final PlaceOfPurchaseData getPlaceOfPurchaseData() {
        return this.placeOfPurchaseData;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final ProductData getProductData() {
        return this.productData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Product)) {
            return false;
        }
        Product product = (Product) other;
        return t.c(this.productData, product.productData) && t.c(this.placeOfPurchaseData, product.placeOfPurchaseData) && t.c(this.businessData, product.businessData);
    }

    public int hashCode() {
        ProductData productData = this.productData;
        int iHashCode = (productData == null ? 0 : productData.hashCode()) * 31;
        PlaceOfPurchaseData placeOfPurchaseData = this.placeOfPurchaseData;
        return ((iHashCode + (placeOfPurchaseData != null ? placeOfPurchaseData.hashCode() : 0)) * 31) + this.businessData.hashCode();
    }

    public String toString() {
        return "Product(productData=" + this.productData + ", placeOfPurchaseData=" + this.placeOfPurchaseData + ", businessData=" + this.businessData + ')';
    }

    public /* synthetic */ Product(ProductData productData, PlaceOfPurchaseData placeOfPurchaseData, Map map, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : productData, (i15 & 2) != 0 ? null : placeOfPurchaseData, (i15 & 4) != 0 ? v0.i() : map);
    }
}
