/**
 * Tradier API
 * Tradier API
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.swagger.api;

import io.swagger.model.Balances;
import java.math.BigDecimal;
import io.swagger.model.OrderPost;
import io.swagger.model.Orders;
import io.swagger.model.Positions;
import io.swagger.model.Profile;
import io.swagger.model.Quotes;
import io.swagger.model.SymbolLookup;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * Tradier API
 *
 * <p>Tradier API
 *
 * API tests for DefaultApi 
 */
public class DefaultApiTest {


    private DefaultApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("https://virtserver.swaggerhub.com/dougrechia/Tradier/1.0.0", DefaultApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1AccountsAccountIdBalancesGetTest() {
        String accountId = null;
        //Balances response = api.v1AccountsAccountIdBalancesGet(accountId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1AccountsAccountIdOrdersGetTest() {
        String accountId = null;
        String includeTags = null;
        //Orders response = api.v1AccountsAccountIdOrdersGet(accountId, includeTags);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1AccountsAccountIdOrdersPostTest() {
        String propertyClass = null;
        String symbol = null;
        String side = null;
        BigDecimal quantity = null;
        String type = null;
        String duration = null;
        String tag = null;
        String accountId = null;
        //OrderPost response = api.v1AccountsAccountIdOrdersPost(propertyClass, symbol, side, quantity, type, duration, tag, accountId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1AccountsAccountIdPositionsGetTest() {
        String accountId = null;
        //Positions response = api.v1AccountsAccountIdPositionsGet(accountId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1MarketsLookupGetTest() {
        String q = null;
        String types = null;
        //SymbolLookup response = api.v1MarketsLookupGet(q, types);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1MarketsQuotesGetTest() {
        String symbols = null;
        //Quotes response = api.v1MarketsQuotesGet(symbols);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1UserProfileGetTest() {
        //Profile response = api.v1UserProfileGet();
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
}