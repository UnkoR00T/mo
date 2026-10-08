package org.bouncycastle.x509;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
public class X509CollectionStoreParameters implements X509StoreParameters {
    private Collection collection;

    public X509CollectionStoreParameters(Collection collection) {
        if (collection == null) {
            throw new NullPointerException("collection cannot be null");
        }
        this.collection = collection;
    }

    public Object clone() {
        return new X509CollectionStoreParameters(this.collection);
    }

    public Collection getCollection() {
        return new ArrayList(this.collection);
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("X509CollectionStoreParameters: [\n");
        sb5.append("  collection: " + this.collection + "\n");
        sb5.append("]");
        return sb5.toString();
    }
}
