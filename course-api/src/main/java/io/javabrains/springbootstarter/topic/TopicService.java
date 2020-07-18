package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;



@Service
public class TopicService {
	private List<Topic> topics = new ArrayList<> (Arrays.asList(new Topic("Spring",
			"Spring framework", "Spring Framework Description"), new Topic(
			"Java", "Spring framework java",
			"Spring Framework Description java"), new Topic("Javascript",
			"Spring framework json", "Spring Framework Description json"),
			new Topic("JSON", "Nilay framework json",
					"Spring 4 Framework Description json")

	));

	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopic(String id){
	return	topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}

	public void updateTopic(Topic topic, String id) {
		for (int i = 0; i < topics.size(); i++) {
			System.out.println("currently we into this location:" + i);

			Topic t = topics.get(i);
			System.out.println("out put inside : t***********:" + t);

			if (t.getId().equals(id)) {
				topics.set(i, topic);

				System.out.println("out put inside : i***********:" + i);

				System.out.println("out put inside loop: topic***********:" + topic);

				System.out.println("##################################");
				System.out.println("##################################");
				System.out.println("##################################");
				return;

			}
		}
		System.out.println("out put inside outer loop: topic***********:" + topic);

		System.out.println("out put outer loop: id***********:" + id);
		
	}

	public void deleteTopic(String id) {
		topics.removeIf(t->t.getId().equals(id));
		
	
	}
	
	
}
